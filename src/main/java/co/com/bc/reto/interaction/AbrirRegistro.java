package co.com.bc.reto.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bc.reto.ui.UtestHomePage.BTN_REGISTRAR;

public class AbrirRegistro implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Click.on(BTN_REGISTRAR));
    }
    public static Performable irARegistro(){
        return Tasks.instrumented(AbrirRegistro.class);
    }
}
