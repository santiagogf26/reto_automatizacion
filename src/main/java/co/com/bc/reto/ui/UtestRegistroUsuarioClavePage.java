package co.com.bc.reto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroUsuarioClavePage {

    public static final Target TXT_CLAVE = Target.the("Escribir contrasena").located(By.id("password"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Escribir confirmacion de contrasena").located(By.id("confirmPassword"));
    public static final Target CHK_TERMINOS = Target.the("Aceptar terminos y condiciones").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target CHK_PRIVACIDAD = Target.the("Aceptar politicas privacidad").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target BTN_TERMINAR_REGISTRO = Target.the("Bton para terminar registro").located(By.id("laddaBtn"));
}
