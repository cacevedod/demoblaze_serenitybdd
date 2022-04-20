package co.com.devco.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickVariosElementos implements Interaction {
    private Target elementos;

    public ClickVariosElementos(Target elementos) {
        this.elementos = elementos;
    }

    public static ClickVariosElementos on(Target elementos){
        return new ClickVariosElementos(elementos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades deletes = this.elementos.resolveAllFor(actor);
        deletes.forEach( delete ->
                actor.attemptsTo(Click.on(delete))
        );
    }
}
