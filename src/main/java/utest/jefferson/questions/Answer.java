package utest.jefferson.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utest.jefferson.userinterface.UTestSignUp;

public class Answer implements Question<Boolean> {
    private String strSuccessfulSignUpMessage;

    public Answer(String strSuccessfulSignUpMessage) {
        this.strSuccessfulSignUpMessage = strSuccessfulSignUpMessage;
    }

    public static Answer toThe(String strSuccessfulSignUpMessage) {
        return new Answer(strSuccessfulSignUpMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message = Text.of(UTestSignUp.COMPLETED_REGISTER).viewedBy(actor).asString();
        if (strSuccessfulSignUpMessage.equals(message)){
            result = true;
        }
        else {
            result =false;
        }
        return result;
    }
}
