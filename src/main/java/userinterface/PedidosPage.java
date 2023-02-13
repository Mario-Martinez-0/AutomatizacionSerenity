package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PedidosPage extends PageObject  {

    public static final Target TXT_CLIENTE = Target.the("Seleccionamos el cliente").located(By.id("select2-chosen-8"));
    public static final Target TXT_CLIENTE2 = Target.the("Seleccionamos el cliente").located(By.id("s2id_autogen8_search"));
    public static final Target TXT_CLIENTE1 = Target.the("Seleccione el cliente").located(By.cssSelector("#select2-drop > ul > li"));

    public static final Target TXT_FECHAORDEN = Target.the("Ingresamos fecha de pedido").located(By.id("Serenity_Demo_Northwind_OrderDialog15_OrderDate"));

    public static final Target TXT_FEHAENVIO = Target.the("Ingresamos fecha de envio").located(By.id("Serenity_Demo_Northwind_OrderDialog15_RequiredDate"));

    public static final Target TXT_EMPLEADO = Target.the("Seleccionamos el empleado").located(By.id("select2-chosen-9"));
    public static final Target TXT_EMPLEADO2 = Target.the("Seleccionamos el empleado").located(By.id("s2id_autogen9_search"));

    public static final Target TXT_EMPLEADO1= Target.the("Seleccione el empledo").located(By.cssSelector("#select2-drop > ul > li"));

    public static final Target TXT_DETALLEPEDI= Target.the("Clieck en detalle de pedido").located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_OrderDialog15_DetailList\"]/div[1]/div/div/div/div[1]/div"));

    public static final Target TXT_PRODUCTO = Target.the("Seleccionamos el producto").located(By.xpath("(//span[contains(@class,'select2-arrow')])[10]"));
    public static final Target TXT_PRODUCTO2 = Target.the("Seleccionamos el producto").located(By.xpath("(//input[@type='text'][contains(@id,'search')])[10]"));
    public static final Target TXT_PRODUCTO1 = Target.the("Seleccione el empledo").located(By.cssSelector("#select2-drop > ul > li"));

    public static final Target TXT_PRECIO = Target.the("Ingrese el precio").located(By.xpath("//input[@name='UnitPrice']"));

    public static final Target TXT_CANTIDAD = Target.the("Ingrese la cantidad de producto").located(By.xpath("//input[@name='Quantity']"));

    public static final Target TXT_GUARDARDETALLE = Target.the("Click en guardar detalle").located(By.xpath("(//span[contains(.,'Save')])[2]"));

    public static final Target TXT_GUARDARPEDIDO = Target.the("Click en guardar pedido").located(By.xpath("//span[@class='button-inner'][contains(.,'Save')]"));


}
