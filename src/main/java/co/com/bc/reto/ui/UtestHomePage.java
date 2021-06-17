package co.com.bc.reto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage {

    public static final Target BTN_REGISTRAR = Target.the("Botón para iniciar registro").located(By.xpath("//a[@class= 'unauthenticated-nav-bar__sign-up']"));
    public static final Target LBL_BIENVENIDA = Target.the("Label bienvenida").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));
}
