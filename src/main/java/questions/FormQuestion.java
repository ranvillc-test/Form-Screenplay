package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.FormHomePage;

public class FormQuestion implements Question{
	
	private final String validate;
	
	public FormQuestion(String validate) {
		this.validate=validate;
	}

	@Override
	public Object answeredBy(Actor actor) {
		if(Text.of(FormHomePage.TEXT_VALID).viewedBy(actor).asString().equals(validate))
			return true;
		else
			return false;
	}
	
	public static FormQuestion formValiText(String validate) {
		return new FormQuestion(validate);
	}

}
