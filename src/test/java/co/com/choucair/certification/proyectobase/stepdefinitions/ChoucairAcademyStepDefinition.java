package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certificaion.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certificaion.proyectobase.questions.Answer;
import co.com.choucair.certificaion.proyectobase.tasks.Login;
import co.com.choucair.certificaion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificaion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinition {

    @Before

    public void SetStage(){ OnStage.setTheStage(new OnlineCast ()); }


    @Given("^than fernando wants to learn automation at the academy choucair$")
    public void thanFernandoWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorCalled("ferna").wasAbleTo(OpenUp.thepage(),Login.
                onThepage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course on the choucair academy platfor$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatfor(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(mensaje)));

    }
}
