package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.InicioPage;
import userinterface.IrPedidoPage;
import userinterface.PedidosPage;


public class PasosPedidoStep implements Task {

    public static PasosPedidoStep pasosPedidoStep() {
        return Tasks.instrumented(PasosPedidoStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioPage.TXT_VIENTO),
                Click.on(IrPedidoPage.TXT_PEDIDO),
                Click.on(IrPedidoPage.TXT_NUEVOPEDIDO));

    }

}
