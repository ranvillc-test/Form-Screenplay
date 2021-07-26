package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.FormQuestion;
import tasks.FormTask;
import ui.FormHomePage;

public class FormSteps {
	
	private FormHomePage homePage=new FormHomePage();
	private String nombreActor;
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("^the user (.*) is in the home page$")
	public void the_user_Rafael_is_in_the_home_page(String nombreActor) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Primer Paso");
		this.nombreActor=nombreActor;
		theActorCalled(nombreActor).attemptsTo(Open.browserOn(homePage));
	    
	}


	@When("^the user enters name (.*) and email (.*)$")
	public void the_user_enters_name_Rafale_and_email_rafael_prueba_com(String name, String email) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Primer Segundo paso");
		theActorCalled(nombreActor).attemptsTo(FormTask.sendForm(name, email));
	    
	}

	@Then("^the form (.*) send successfully$")
	public void the_form_Name_Rafael_send_successfully(String validate) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(FormQuestion.formValiText(validate)));
		
		Thread.sleep(5000);
	                                                                                                                                                                                                                   
	}


}
