package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeDetalleProductoPage {
	public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton agregar carrito").located(By.xpath("//a[text()='Add to cart']"));
}
