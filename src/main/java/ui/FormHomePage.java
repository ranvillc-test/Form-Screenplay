package ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/text-box")
public class FormHomePage extends PageObject{
	public static final Target INPUT_NAME = Target.the("Enters name ").located(By.id("userName"));
	public static final Target INPUT_EMAIL = Target.the("Enters email ").located(By.id("userEmail"));
	public static final Target SEE_BUTTON = Target.the("Locate Button").located(By.id("userName-label"));
	public static final Target BUTTON = Target.the("Bottun submit ").located(By.id("submit"));
	public static final Target TEXT_VALID = Target.the("the user validates the submission of the form").located(By.id("name"));
	
	

}
