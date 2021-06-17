package co.com.bc.reto.tasks;

import co.com.bc.reto.interaction.AbrirRegistro;
import co.com.bc.reto.model.DatosRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.bc.reto.ui.UtestRegistroInfoPersonalPage.*;

public class RegistroLlenarInfoPersonal implements Task {

    private final DatosRegistroUsuario datosRegistroUsuario;

    public RegistroLlenarInfoPersonal(DatosRegistroUsuario datosRegistroUsuario) {
        this.datosRegistroUsuario = datosRegistroUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AbrirRegistro.irARegistro(),
                Enter.theValue(datosRegistroUsuario.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datosRegistroUsuario.getApellidos()).into(TXT_APELLIDOS),
                Enter.theValue(datosRegistroUsuario.getEmail()).into(TXT_EMAIL),
                SelectFromOptions.byVisibleText(datosRegistroUsuario.getMesNacimiento()).from(LST_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datosRegistroUsuario.getDiaNacimiento()).from(LST_DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datosRegistroUsuario.getAnoNacimiento()).from(LST_ANO_NACIMIENTO),
                Click.on(BTN_AVANZAR_LOCATION));
    }

    public static Performable conDatos(DatosRegistroUsuario datosRegistroUsuario) {
        return Instrumented.instanceOf(RegistroLlenarInfoPersonal.class).withProperties(datosRegistroUsuario);
    }
}
