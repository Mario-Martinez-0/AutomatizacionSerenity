package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PedidosPage;

public class GeneralPedidoStep implements Task {

    private String cliente, fechaOrden, fechaEnvio, Empleado;

    public GeneralPedidoStep(String cliente, String fechaOrden, String fechaEnvio, String empleado) {
        this.cliente = cliente;
        this.fechaOrden = fechaOrden;
        this.fechaEnvio = fechaEnvio;
        this.Empleado = empleado;
    }

    public static GeneralPedidoStep generalPedidoStep(String cliente, String fechaOrden, String fechaEnvio, String Empleado) {
        return Tasks.instrumented(GeneralPedidoStep.class, cliente, fechaOrden, fechaEnvio, Empleado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PedidosPage.TXT_CLIENTE),
                Enter.theValue(cliente).into(PedidosPage.TXT_CLIENTE2), Click.on(PedidosPage.TXT_CLIENTE1),
                Enter.theValue(fechaOrden).into(PedidosPage.TXT_FECHAORDEN),
                Enter.theValue(fechaEnvio).into(PedidosPage.TXT_FEHAENVIO),
                Click.on(PedidosPage.TXT_EMPLEADO),
                Enter.theValue(Empleado).into(PedidosPage.TXT_EMPLEADO2), Click.on(PedidosPage.TXT_EMPLEADO1)
        );
    }

}
