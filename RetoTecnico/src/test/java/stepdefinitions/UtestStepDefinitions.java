package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.Wait;
import model.PersonalInformation;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import sun.nio.cs.Surrogate;
import tasks.FormUser;
import tasks.OpenUp;


import java.util.List;

public class UtestStepDefinitions {

    private Surrogate TheRequisitionExternalEmployee;

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Maria want to know the sities uTest$")
    public void thanMariaWantToKnowTheSitiesUTest() {
        OnStage.theActorCalled("Maria").wasAbleTo(OpenUp.ThePage());
        Wait.aWhile(10000);

    }


    @When("^entering the data from the uTest registration form$")
    public void enteringTheDataFromTheUTestRegistrationForm(List<PersonalInformation> personalInformation) {

        OnStage.theActorInTheSpotlight().attemptsTo(FormUser.The(personalInformation.get(0).getName(),personalInformation.get(0).getLast_name(),personalInformation.get(0).getEmail(),
               personalInformation.get(0).getMonth_of_birth(),personalInformation.get(0).getDay_birth(),personalInformation.get(0).getYear_birth(),personalInformation.get(0).getOperative_system(),
               personalInformation.get(0).getVersion_operative_system(),personalInformation.get(0).getLanguage(),personalInformation.get(0).getPassword(),personalInformation.get(0).getPassword_confirmation()));

    }

       @Then("^She Know the functionalities of the uTest$")
        public void sheKnowTheFunctionalitiesOfTheUTest (List<PersonalInformation> personalInformation) {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(personalInformation.get(0).getWelcome())));

        }



}
