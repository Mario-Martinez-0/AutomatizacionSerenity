package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.InicioPage;

public class ValidarPedidoSted implements Question<Boolean> {

    public static Question<Boolean> pedidoCreado(){
        return new ValidarPedidoSted();}

        @Override
        public Boolean answeredBy(Actor actor) {
        return InicioPage.VALIDARPEDIDO.resolveFor(actor).isDisplayed(); }
}
