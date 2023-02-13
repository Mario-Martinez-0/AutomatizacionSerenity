package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

      public static final Target TXT_USUARIO = Target.the("Escribimos el usuario").located(By.id("LoginPanel0_Username"));

    public static final Target TXT_CONTRASENA = Target.the("Escribimos la contrasena").located(By.id("LoginPanel0_Password"));

    public static final Target BTN_INICIO = Target.the("Click en el boton iniciar sesion").located(By.id("LoginPanel0_LoginButton"));

    public static final Target TXT_VIENTO = Target.the("Click en viento del norte").located(By.xpath("//*[@id=\"nav_menu1_2\"]/li[1]/a/em"));

    public static final Target TXT_CLIENTE = Target.the("Click en cliente").located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[1]/a/span"));

    public static final Target TXT_NUEVOCLIENTE = Target.the("Click en nuevo cliente").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]"));

    public static final Target VALIDARPEDIDO = Target.the("Validando el pedido").located(By.xpath("//span[contains(text(),' New Order')]"));

}
