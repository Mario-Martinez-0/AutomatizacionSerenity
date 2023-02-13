package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FormularioClientePage;

public class ValidarClienteStep implements Question<Boolean> {

    private String respuesta;

    public ValidarClienteStep(String respuesta) {
        this.respuesta = respuesta;
    }

    public static ValidarClienteStep confirmarResultado (String respuesta) {
        return new ValidarClienteStep(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resul;
        String resultado = Text.of(FormularioClientePage.RESULTADOCLIENTE).viewedBy(actor).asString();
            if(respuesta.equals(resultado)){
                resul = true;
            }else{
                resul = false;
            }
            return resul;
    }

}
