package co.com.bc.reto.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

public class AbrirPaginaWeb implements Task {

    private EnvironmentVariables environmentVariables;
    private String urlTest;

    @Override
    public <T extends Actor> void performAs(T actor) {
        urlTest = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("utest.url");
        actor.attemptsTo(Open.url(urlTest));
    }
    public static Performable conUrl(){
        return Tasks.instrumented(AbrirPaginaWeb.class);
    }
}
