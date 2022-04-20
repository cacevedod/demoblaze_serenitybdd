package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeIndexPage {
	public static final Target LINK_LOGIN = Target.the("link para el login").located(By.xpath("//a[@id='login2']"));
	public static final Target LINK_CARRITO = Target.the("link para el carrito").located(By.xpath("//a[@id='cartur']"));
	public static final Target LINK_HOME = Target.the("link para el home").located(By.xpath("//a[text()='Home ']"));
}
