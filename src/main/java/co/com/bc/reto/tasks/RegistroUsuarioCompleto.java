package co.com.bc.reto.tasks;

import co.com.bc.reto.model.DatosRegistroUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class RegistroUsuarioCompleto implements Task {

    private final DatosRegistroUsuario datosRegistroUsuario;

    public RegistroUsuarioCompleto(DatosRegistroUsuario datosRegistroUsuario) {
        this.datosRegistroUsuario = datosRegistroUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RegistroLlenarInfoPersonal.conDatos(datosRegistroUsuario),
                RegistroLlenarUbicacion.datosUbicacion(datosRegistroUsuario),
                RegistroLlenarInfoDispositivos.ingresarDispositivos(datosRegistroUsuario),
                RegistroUsuarioConfClave.confClave(datosRegistroUsuario));
    }

    public static Performable conLaInformacion(DatosRegistroUsuario datosRegistroUsuario) {
        return Instrumented.instanceOf(RegistroUsuarioCompleto.class).withProperties(datosRegistroUsuario);
    }
}
