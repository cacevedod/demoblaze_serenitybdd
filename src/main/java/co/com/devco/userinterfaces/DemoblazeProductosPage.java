package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeProductosPage {
	public static final Target LINK_PRODUCTO = Target.the("link del producto").locatedBy("//a[text()='{0}']");
}
