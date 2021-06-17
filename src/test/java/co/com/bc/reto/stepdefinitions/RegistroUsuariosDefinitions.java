package co.com.bc.reto.stepdefinitions;

import co.com.bc.reto.model.DatosRegistroUsuario;
import co.com.bc.reto.tasks.AbrirPaginaWeb;
import co.com.bc.reto.tasks.RegistroUsuarioCompleto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.bc.reto.ui.UtestHomePage.LBL_BIENVENIDA;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroUsuariosDefinitions {

    @Dado("que {string} se encuentra en la pagina web")
    public void queSeEncuentraEnLaPaginaWeb(String actor) {
    theActorCalled(actor).wasAbleTo(AbrirPaginaWeb.conUrl());
    }

    @Cuando("realiza el proceso de registro")
    public void realizaElProcesoDeRegistro(DatosRegistroUsuario datosRegistroUsuario) {
        theActorInTheSpotlight().attemptsTo(RegistroUsuarioCompleto.conLaInformacion(datosRegistroUsuario));
    }

    @Entonces("visualiza el home page de utest")
    public void visualizaElHomePageDeUtest() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_BIENVENIDA).isDisplayed());

    }
}
