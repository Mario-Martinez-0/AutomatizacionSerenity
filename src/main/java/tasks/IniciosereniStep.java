package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.InicioPage;

public class IniciosereniStep implements Task {

    private String usuario, contrasena;

    public IniciosereniStep(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static IniciosereniStep iniciosereniStep(String usuario, String contrasena) {
        return Tasks.instrumented(IniciosereniStep.class, usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(InicioPage.TXT_USUARIO),
                Enter.theValue(contrasena).into(InicioPage.TXT_CONTRASENA),
                Click.on(InicioPage.BTN_INICIO)
        );
    }
}
