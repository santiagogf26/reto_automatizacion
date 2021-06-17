package co.com.bc.reto.tasks;

import co.com.bc.reto.model.DatosRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bc.reto.ui.UtestRegistroUsuarioClavePage.*;

public class RegistroUsuarioConfClave implements Task {

    private final DatosRegistroUsuario datosRegistroUsuario;

    public RegistroUsuarioConfClave(DatosRegistroUsuario datosRegistroUsuario) {
        this.datosRegistroUsuario = datosRegistroUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistroUsuario.getContrasena()).into(TXT_CLAVE),
                Enter.theValue(datosRegistroUsuario.getContrasena()).into(TXT_CONFIRMAR_CLAVE),
                Click.on(CHK_TERMINOS),
                Click.on(CHK_PRIVACIDAD),
                Click.on(BTN_TERMINAR_REGISTRO));
    }

    public static Performable confClave(DatosRegistroUsuario datosRegistroUsuario) {
        return Instrumented.instanceOf(RegistroUsuarioConfClave.class).withProperties(datosRegistroUsuario);

    }
}
