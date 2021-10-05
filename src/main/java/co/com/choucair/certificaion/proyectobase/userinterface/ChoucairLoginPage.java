package co.com.choucair.certificaion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("Boton ingresar").
            located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a/strong"));

    public static final Target INPUT_USER = Target.the("Nombre de usuario").located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Contraseña").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the(" Acceder").
            located(By.xpath ("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));


}