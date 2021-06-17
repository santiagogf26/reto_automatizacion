package co.com.bc.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registrousuarios/registro_usuarios.feature",
        glue = "co.com.bc.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")
public class RegistroUsuarios {
}
