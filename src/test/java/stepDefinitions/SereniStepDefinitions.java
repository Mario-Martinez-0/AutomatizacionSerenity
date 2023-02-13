package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarClienteStep;
import tasks.*;

import java.util.List;

public class SereniStepDefinitions {

    @Before
    public  void setStage(){ OnStage.setTheStage((new OnlineCast()));
    }

    @Dado("^que mario abre la pagina \"([^\"]*)\"$")
    public void queMarioAbreLaPagina(String url) {
        OnStage.theActorCalled("Mario").wasAbleTo(AbrirSereni.abrirApp(url));
    }
    @Dado("^realiza el login exitoso con usuario y contraena \"([^\"]*)\" \"([^\"]*)\"$")
    public void realizaElLoginExitosoConUsuarioYContraena(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciosereniStep.iniciosereniStep(usuario, contrasena));
    }

    @Cuando("^damos click en nuevo cliente, diligenciamos el formulario con los datos de nuevo cliente y le damos click en ahorrar$")
    public void damosClickEnNuevoClienteDiligenciamosElFormularioConLosDatosDeNuevoClienteYLeDamosClickEnAhorrar(List <String> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClienteNuevoStep.clienteNuevoStep(datos.get(0),datos.get(1),datos.get(2),datos.get(3),datos.get(4),datos.get(5),datos.get(6),
                datos.get(7), datos.get(8), datos.get(9), datos.get(10), datos.get(11), datos.get(12), datos.get(13), datos.get(14)));
    }

    @Entonces("^mario vera el nuevo cliente en la lista de clientes registrados$")
    public void marioVeraElNuevoClienteEnLaListaDeClientesRegistrados(List <String> datos){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarClienteStep.confirmarResultado(datos.get(0))));
    }

    @Dado("^que mario quiere crear un nuecvo pedido$")
    public void queMarioQuiereCrearUnNuecvoPedido(List <String> datos)  {
        OnStage.theActorInTheSpotlight().attemptsTo(PasosPedidoStep.pasosPedidoStep());
        OnStage.theActorInTheSpotlight().attemptsTo(GeneralPedidoStep.generalPedidoStep(datos.get(0), datos.get(1), datos.get(2), datos.get(3)));
    }

    @Cuando("^mario ingrese los datos del pedido y de click en guardar$")
    public void marioIngreseLosDatosDelPedidoYDeClickEnGuardar(List <String> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioPedidoStep.formularioPedidoStep(datos.get(0), datos.get(1), datos.get(2)));

    }

    @Entonces("^mario vera el nuepo pedio en la lista de pedidos registrados$")
    public void marioVeraElNuepoPedioEnLaListaDePedidosRegistrados() {

    }

}
