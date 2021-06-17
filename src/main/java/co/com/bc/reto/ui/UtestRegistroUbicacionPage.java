package co.com.bc.reto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroUbicacionPage {

    public static final Target TXT_CIUDAD = Target.the("Ingresar ciudad").located(By.id("city"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("Ingresar codigo postal").located(By.id("zip"));
    public static final Target BTN_PAIS = Target.the("Ingresar a los paises").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target TXT_PAIS = Target.the("Escribir pais").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));
    public static final Target BTN_AVANZAR_DISPOSITIVOS = Target.the("Boton para avanzar a dispositivos").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));
    public static final Target BTN_AVANZAR_CONTRASENA = Target.the("Boton para avanzar a configurar pass").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

}
