package co.com.choucair.certificaion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage  {

    public static final Target BUTTON_UC =Target.the("seleciona universidad choucair").
            located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE =Target.the("buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO =Target.the("Da click en buscar").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE =Target.the("Da clik en el curso encontrado ").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));
    public static final  Target NAME_COURSE = Target.the("extarer el nombre del curso").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
