package co.com.bc.reto.tasks;

import co.com.bc.reto.model.DatosRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.bc.reto.ui.UtestRegistroUbicacionPage.*;

public class RegistroLlenarUbicacion implements Task {

    private final DatosRegistroUsuario datosRegistroUsuario;

    public RegistroLlenarUbicacion(DatosRegistroUsuario datosRegistroUsuario) {
        this.datosRegistroUsuario = datosRegistroUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistroUsuario.getCiudad()).into(TXT_CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(TXT_CIUDAD),
                Hit.the(Keys.ENTER).into(TXT_CIUDAD),
                Enter.theValue(datosRegistroUsuario.getCodigoPostal()).into(TXT_CODIGO_POSTAL),
                Click.on(BTN_PAIS),
                Enter.theValue(datosRegistroUsuario.getPais()).into(TXT_PAIS).thenHit(Keys.ENTER),
                Click.on(BTN_AVANZAR_DISPOSITIVOS));
    }

    public static Performable datosUbicacion(DatosRegistroUsuario datosRegistroUsuario){
        return Instrumented.instanceOf(RegistroLlenarUbicacion.class).withProperties(datosRegistroUsuario);
    }
}
