package utest.jefferson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utest.jefferson.userinterface.UTestPage;

public class ClickButton implements Task {

    public static ClickButton joinToday(){
        return Tasks.instrumented(ClickButton.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.JOIN_TODAY_BUTTON));
    }
}
