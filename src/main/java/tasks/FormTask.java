package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import ui.FormHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormTask implements Task{
	
	private final String name;
	private final String email;
	
	public FormTask(String name,String email) {
		this.name=name;
		this.email=email;
	}

	@Override
	public <T extends Actor> void performAs(T actor){
		actor.attemptsTo(Enter.theValue(name).into(FormHomePage.INPUT_NAME));
		actor.attemptsTo(Enter.theValue(email).into(FormHomePage.INPUT_EMAIL));
		actor.attemptsTo(Scroll.to(FormHomePage.SEE_BUTTON));
		actor.attemptsTo(Click.on(FormHomePage.BUTTON));
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public static Performable sendForm(String name,String email) {
		return instrumented(FormTask.class,name,email);
	}
	
}
