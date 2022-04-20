package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeLoginPage {
	public static final Target TEXT_USUARIO = Target.the("campo usuario login").located(By.id("loginusername"));
	public static final Target TEXT_CONTRASENA = Target.the("campo contraseña login").located(By.id("loginpassword"));
	public static final Target BOTON_LOGIN = Target.the("botón login").located(By.xpath("//button[text()='Log in']"));
}
