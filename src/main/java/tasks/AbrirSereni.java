package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSereni implements Task {


    private String url;

    public AbrirSereni(String url) {
        this.url = url;
    }

    public static AbrirSereni abrirApp(String url) {
        return Tasks.instrumented(AbrirSereni.class, url);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));

    }
}
