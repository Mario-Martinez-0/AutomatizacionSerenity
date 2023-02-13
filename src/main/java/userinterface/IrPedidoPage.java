package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class IrPedidoPage extends PageObject {

    public static final Target TXT_PEDIDO = Target.the("Click en pedido").located(By.xpath("//span[contains(text(),'Orders')]"));

    public static final Target TXT_NUEVOPEDIDO = Target.the("Click en nuevo pedido").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div[1]/div[1]/div/span"));

}
