package co.com.choucair.certificaion.proyectobase.tasks;

import co.com.choucair.certificaion.proyectobase.userinterface.choucairAcademypage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private co.com.choucair.certificaion.proyectobase.userinterface.choucairAcademypage choucairAcademypage;
    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Open.browserOn(choucairAcademypage));
    }
}
