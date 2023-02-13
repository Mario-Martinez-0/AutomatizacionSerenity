package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioClientePage extends PageObject {

    public static final Target TXT_IDENTIFICACLIENTE = Target.the("Ingrsar identificacion cliente").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CustomerID"));

    public static final Target TXT_NOMEMPRESA = Target.the("Ingresar el nombre de empresa").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CompanyName"));

    public static final Target TXT_NOMCONTACTO = Target.the("Ingresar nombre de contacto").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_ContactName"));

    public static final Target TXT_TITULOCONTACTO = Target.the("Igresar tituclo de contacto").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_ContactTitle"));

    public static final Target TXT_REPRESENTANTE = Target.the("Seleccionar repreesentante").located(By.id("s2id_autogen4"));

    public static final Target TXT_REPRESENTANTE1 = Target.the("Seleccionar opcion").located(By.cssSelector("#select2-drop > ul > li"));
    public static final Target TXT_DIRECCION = Target.the("Ingresar la direccion").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Address"));

    public static final Target TXT_PAIS = Target.the("Selecione un pais").located(By.xpath("//*[@id=\"s2id_Serenity_Demo_Northwind_CustomerDialog9_Country\"]/a/span[2]"));
    public static final Target TXT_PAIS1 = Target.the("Selecione una opcion").located(By.id("select2-results-5"));
    public static final Target TXT_PAIS2 = Target.the("Selecion").located(By.xpath("//*[@id=\"s2id_autogen5_search\"]"));

    public static final Target TXT_CIUDAD = Target.the("Selecione la ciudad").located(By.id("select2-chosen-6"));
    public static final Target TXT_CIUDAD1 = Target.the("Selecione una opcion").located(By.id("select2-results-6"));
    public static final Target TXT_CIUDAD2 = Target.the("Selecione una opcion").located(By.id("s2id_autogen6_search"));

    public static final Target TXT_REGIO = Target.the("Ingresar la region").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Region"));

    public static final Target TXT_CODIGOPOS = Target.the("Igresar el codigo postal").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_PostalCode"));

    public static final Target TXT_TELEFONO = Target.the("Ingrese el telefono").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Phone"));

    public static final Target TXT_FAX = Target.the("Ingrese el fax").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Fax"));

    public static final Target TXT_FECHACONTACTO = Target.the("Ingresar fecha").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_LastContactDate"));

    public static final Target TXT_CONTACTADOPOR = Target.the("Igresar quien lo contacto").located(By.id("select2-chosen-7"));
    public static final Target TXT_CONTACTADOPOR1 = Target.the("Igresar quien lo contacto").located(By.cssSelector("#select2-drop > ul > li"));
    public static final Target TXT_CONTACTADOPOR2 = Target.the("Igresar quien lo contacto").located(By.id("s2id_autogen7_search"));

    public static final Target TXT_CORREO = Target.the("Ingrese el correo").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Email"));

    public static final Target CHK_ENVIAR = Target.the("seleccionar enviar").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_SendBulletin"));
    public static final Target BTN_APLICAR = Target.the("Click en aplicar").located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_CustomerDialog9_Toolbar\"]/div/div/div/div[1]/div"));
    public static final Target BUSCAR = Target.the("Buscar el cliente clreado").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[1]/input"));
    public static final Target RESULTADOCLIENTE = Target.the("Buscar el cliente clreado").located(By.xpath("(//div/a)[13]"));
}
