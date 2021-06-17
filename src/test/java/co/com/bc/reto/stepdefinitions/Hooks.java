package co.com.bc.reto.stepdefinitions;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before(order = 1)
    public void set_stage(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }
}
