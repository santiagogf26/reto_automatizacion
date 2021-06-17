package co.com.bc.reto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroDispositivosPage {

    public static final Target BTN_DISPOSITIVO = Target.the("Ingresar a Seleccionar dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target TXT_DISPOSITIVO = Target.the("Campo para escribir dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));
    public static final Target BTN_MODELO_DISPOSITIVO = Target.the("Ingresar a Seleccionar modelo dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target TXT_MODELO_DISPOSITIVO = Target.the("Campo para escribir modelo dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input[1]"));
    public static final Target BTN_OS_DISPOSITIVO = Target.the("Ingresar a Seleccionar OS dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target TXT_OS_DISPOSITIVO = Target.the("Campo para escribir OS dispositivo movil").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/input[1]"));
}
