package co.com.bc.reto.tasks;

import co.com.bc.reto.model.DatosRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.bc.reto.ui.UtestRegistroDispositivosPage.*;
import static co.com.bc.reto.ui.UtestRegistroUbicacionPage.BTN_AVANZAR_CONTRASENA;

public class RegistroLlenarInfoDispositivos implements Task {

    private final DatosRegistroUsuario datosRegistroUsuario;

    public RegistroLlenarInfoDispositivos(DatosRegistroUsuario datosRegistroUsuario) {
        this.datosRegistroUsuario = datosRegistroUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_DISPOSITIVO),
                Enter.theValue(datosRegistroUsuario.getDispositivo()).into(TXT_DISPOSITIVO).thenHit(Keys.ENTER),
                Click.on(BTN_MODELO_DISPOSITIVO),
                Enter.theValue(datosRegistroUsuario.getModeloDispositivo()).into(TXT_MODELO_DISPOSITIVO).thenHit(Keys.ENTER),
                Click.on(BTN_OS_DISPOSITIVO),
                Enter.theValue(datosRegistroUsuario.getOsDispositivo()).into(TXT_OS_DISPOSITIVO).thenHit(Keys.ENTER),
                Click.on(BTN_AVANZAR_CONTRASENA));
    }

    public static Performable ingresarDispositivos(DatosRegistroUsuario datosRegistroUsuario) {
        return Instrumented.instanceOf(RegistroLlenarInfoDispositivos.class).withProperties(datosRegistroUsuario);
    }
}
