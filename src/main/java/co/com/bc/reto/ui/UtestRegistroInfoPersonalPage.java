package co.com.bc.reto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroInfoPersonalPage {

    public static final Target TXT_NOMBRE = Target.the("Campo para ingresar nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDOS = Target.the("Campo para ingresar apellidos").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Campo para ingresar email").located(By.id("email"));
    public static final Target LST_MES_NACIMIENTO = Target.the("Lista de meses").located(By.id("birthMonth"));
    public static final Target LST_DIA_NACIMIENTO = Target.the("Lista de dias").located(By.id("birthDay"));
    public static final Target LST_ANO_NACIMIENTO = Target.the("Lista de anos nacimiento").located(By.id("birthYear"));
    public static final Target BTN_AVANZAR_LOCATION = Target.the("Botón para avanzar a los datos de ubicacion").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));

}
