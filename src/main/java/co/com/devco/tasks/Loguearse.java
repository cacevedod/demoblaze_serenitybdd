package co.com.devco.tasks;

import co.com.devco.model.UsuarioFactory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.DemoblazeIndexPage.LINK_LOGIN;
import static co.com.devco.userinterfaces.DemoblazeLoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse implements Task {
    private String rol;

    public Loguearse(String rol) {
        this.rol = rol;
    }

    public static Performable como(String rol) {
        return instrumented(Loguearse.class, rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/#"),
                Click.on(LINK_LOGIN),
                Enter.theValue(UsuarioFactory.delRol(rol).getUsuario()).into(TEXT_USUARIO),
                Enter.theValue(UsuarioFactory.delRol(rol).getPassword()).into(TEXT_CONTRASENA),
                Click.on(BOTON_LOGIN)
        );
    }
}
