package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.devco.userinterfaces.DemoblazeDetalleProductoPage.BOTON_AGREGAR_CARRITO;
import static co.com.devco.userinterfaces.DemoblazeIndexPage.LINK_CARRITO;
import static co.com.devco.userinterfaces.DemoblazeProductosPage.LINK_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarrito implements Task {
    private String producto;

    public AgregarAlCarrito(String producto) {
        this.producto = producto;
    }

    public static Performable elProducto(String producto) {
        return instrumented(AgregarAlCarrito.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_PRODUCTO.of(producto)),
                Click.on(BOTON_AGREGAR_CARRITO),
                WaitUntil.the(LINK_CARRITO, isVisible()).forNoMoreThan(Duration.ofSeconds(6)),
                Click.on(LINK_CARRITO)
        );
    }
}
