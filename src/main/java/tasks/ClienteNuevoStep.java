package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FormularioClientePage;
import userinterface.InicioPage;

import static userinterface.FormularioClientePage.TXT_DIRECCION;
import static userinterface.FormularioClientePage.TXT_PAIS1;

public class ClienteNuevoStep implements Task {


    private String identificacion, nomEmpresa, nomContacto, tituloContacto, representante, direccion, pais, ciudad, region, codPostal, telefono, fax,
            ultimContacto, contactadoPor, correo;

    public ClienteNuevoStep(String identificacion, String nomEmpresa, String nomContacto, String tituloContacto, String representante, String direccion, String pais, String ciudad,
                            String region, String codPostal, String telefono, String fax, String ultimContacto, String contactadoPor, String correo) {
        this.identificacion = identificacion;
        this.nomEmpresa = nomEmpresa;
        this.nomContacto = nomContacto;
        this.tituloContacto = tituloContacto;
        this.representante = representante;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.region = region;
        this.codPostal = codPostal;
        this.telefono = telefono;
        this.fax = fax;
        this.ultimContacto = ultimContacto;
        this.contactadoPor = contactadoPor;
        this.correo = correo;
    }

    public static ClienteNuevoStep clienteNuevoStep(String identificacion, String nomEmpresa, String nomContacto, String tituloContacto, String representante, String direccion, String pais,
                                                    String ciudad, String region, String codPostal, String telefono, String fax,
                                                    String ultimContacto, String contactadoPor, String correo) {
        return Tasks.instrumented(ClienteNuevoStep.class, identificacion, nomEmpresa, nomContacto, tituloContacto, representante, direccion, pais, ciudad, region, codPostal, telefono, fax,
                ultimContacto, contactadoPor, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioPage.TXT_VIENTO),
                Click.on(InicioPage.TXT_CLIENTE),
                Click.on(InicioPage.TXT_NUEVOCLIENTE),
                Enter.theValue(identificacion).into(FormularioClientePage.TXT_IDENTIFICACLIENTE),
                Enter.theValue(nomEmpresa).into(FormularioClientePage.TXT_NOMEMPRESA),
                Enter.theValue(nomContacto).into(FormularioClientePage.TXT_NOMCONTACTO),
                Enter.theValue(tituloContacto).into(FormularioClientePage.TXT_TITULOCONTACTO),
                Enter.theValue(representante).into(FormularioClientePage.TXT_REPRESENTANTE),
                Enter.theValue(direccion).into(TXT_DIRECCION), Click.on(FormularioClientePage.TXT_REPRESENTANTE1),
                Click.on(FormularioClientePage.TXT_PAIS),
                Enter.theValue(pais).into(FormularioClientePage.TXT_PAIS2), Click.on(TXT_PAIS1),
                Click.on(FormularioClientePage.TXT_CIUDAD),
                Enter.theValue(ciudad).into(FormularioClientePage.TXT_CIUDAD2), Click.on(FormularioClientePage.TXT_CIUDAD1),
                Enter.theValue(region).into(FormularioClientePage.TXT_REGIO),
                Enter.theValue(codPostal).into(FormularioClientePage.TXT_CODIGOPOS),
                Enter.theValue(telefono).into(FormularioClientePage.TXT_TELEFONO),
                Enter.theValue(fax).into(FormularioClientePage.TXT_FAX),
                Enter.theValue(ultimContacto).into(FormularioClientePage.TXT_FECHACONTACTO),
                Click.on(FormularioClientePage.TXT_CONTACTADOPOR),
                Enter.theValue(contactadoPor).into(FormularioClientePage.TXT_CONTACTADOPOR2), Click.on(FormularioClientePage.TXT_CONTACTADOPOR1),
                Enter.theValue(correo).into(FormularioClientePage.TXT_CORREO),
                Click.on(FormularioClientePage.CHK_ENVIAR),
                Click.on(FormularioClientePage.BTN_APLICAR),
                Enter.theValue(identificacion).into(FormularioClientePage.BUSCAR));
    }


}
