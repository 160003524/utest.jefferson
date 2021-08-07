package utest.jefferson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button to sing up").located(By.className("unauthenticated-nav-bar__sign-up"));
}
