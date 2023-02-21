package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterface.PedidosPage;

public class FormularioPedidoStep implements Task {

    private String producto, precio, cantidad;

    public FormularioPedidoStep(String producto, String precio, String cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public static FormularioPedidoStep formularioPedidoStep(String producto, String precio, String cantidad) {
        return Tasks.instrumented(FormularioPedidoStep.class, producto, precio, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PedidosPage.TXT_DETALLEPEDI),
                Click.on(PedidosPage.TXT_PRODUCTO),
                Enter.theValue(producto).into(PedidosPage.TXT_PRODUCTO2), Click.on(PedidosPage.TXT_PRODUCTO1),
                Enter.theValue(precio).into(PedidosPage.TXT_PRECIO),
                Enter.theValue(cantidad).into(PedidosPage.TXT_CANTIDAD),
                Click.on(PedidosPage.TXT_GUARDARDETALLE),
                Click.on(PedidosPage.TXT_GUARDARPEDIDO));


    }
}
