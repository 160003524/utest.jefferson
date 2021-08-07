package utest.jefferson.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUp {
    public static final Target INPUT_FIRST_NAME = Target.the("write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email").located(By.id("email"));
    public static final Target INPUT_MONTH_B = Target.the("write the birth month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY_B = Target.the("write the birth day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR_B = Target.the("write the birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("select the language").located(By.xpath("//div[@id='languages']//input[@type='search']"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("button send us to the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_CITY = Target.the("write the city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("write the postal code").located(By.id("zip"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("button send us to next devices").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target BUTTON_REMOVE_DATA_PC = Target.the("button that removes data from computer section").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i"));
    public static final Target BUTTON_DATA_PC = Target.the("button that contains the data pc").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_DATA_PC = Target.the("field that contains the data pc").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target BUTTON_VERSION_PC = Target.the("button that contains the PC version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION_PC = Target.the("write the PC version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target BUTTON_LANGUAGE_SO_PC = Target.the("button to select the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE_SO_PC = Target.the("select the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_MOBILE_DEVICE = Target.the("button to select the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("select the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target BUTTON_MODEL_DEVICE = Target.the("button to select the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL_DEVICE = Target.the("select the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target BUTTON_MOBILE_DEVICE_OS = Target.the("button to select the mobile device os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_DEVICE_OS = Target.the("select the mobile device os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LAST_STEP = Target.the("button that lead us to the last page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target PASSWORD_USER = Target.the("input the password").located(By.id("password"));
    public static final Target PASSWORD_USER_CONFIRMATION = Target.the("input the password confirmation").located(By.id("confirmPassword"));
    public static final Target BUTTON_STAY_INFORMED = Target.the("checkbox to stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target BUTTON_TERMS = Target.the("checkbox to accept the terms an conditions").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target BUTTON_PRIVACY_POLICY = Target.the("checkbox the privacy policy to accept").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE = Target.the("button  to complete the sgn up").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target COMPLETED_REGISTER = Target.the("page to confirmation the process").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));








}
