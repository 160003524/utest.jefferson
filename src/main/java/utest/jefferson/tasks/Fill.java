package utest.jefferson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import utest.jefferson.userinterface.UTestSignUp;

public class Fill implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strUserLanguage;
    private String strCity;
    private String strZipPostalCode;
    private String strCountry;
    private String strComputerOs;
    private String strOsVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;
    private String strPassword;

    public Fill(String strFirstName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strUserLanguage = strUserLanguage;
        this.strCity = strCity;
        this.strZipPostalCode = strZipPostalCode;
        this.strCountry = strCountry;
        this.strComputerOs = strComputerOs;
        this.strOsVersion = strOsVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strMobileOs = strMobileOs;
        this.strPassword = strPassword;
    }

    public static Fill thePage(String strFirstName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        return Tasks.instrumented(Fill.class,strFirstName,strLastName,strEmailAddress,strBirthMonth,strBirthDay,strBirthYear,strUserLanguage,strCity,strZipPostalCode,strCountry,strComputerOs,strOsVersion,strComputerLanguage,strMobileDevice,strModel,strMobileOs,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UTestSignUp.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestSignUp.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UTestSignUp.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UTestSignUp.INPUT_MONTH_B),
                SelectFromOptions.byVisibleText(strBirthDay).from(UTestSignUp.INPUT_DAY_B),
                SelectFromOptions.byVisibleText(strBirthYear).from(UTestSignUp.INPUT_YEAR_B),
                Click.on(UTestSignUp.INPUT_LANGUAGE),
                Enter.theValue(strUserLanguage).into(UTestSignUp.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_LANGUAGE),
                Click.on(UTestSignUp.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UTestSignUp.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_CITY),
                Enter.theValue(strZipPostalCode).into(UTestSignUp.INPUT_POSTAL_CODE),
                Click.on(UTestSignUp.BUTTON_NEXT_DEVICES),
                Click.on(UTestSignUp.BUTTON_REMOVE_DATA_PC),
                Click.on(UTestSignUp.BUTTON_DATA_PC),
                Enter.theValue(strComputerOs).into(UTestSignUp.INPUT_DATA_PC),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_DATA_PC),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_DATA_PC),
                Click.on(UTestSignUp.BUTTON_VERSION_PC),
                Enter.theValue(strOsVersion).into(UTestSignUp.INPUT_VERSION_PC),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_VERSION_PC),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_VERSION_PC),
                Click.on(UTestSignUp.BUTTON_LANGUAGE_SO_PC),
                Enter.theValue(strComputerLanguage).into(UTestSignUp.INPUT_LANGUAGE_SO_PC),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_LANGUAGE_SO_PC),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_LANGUAGE_SO_PC),
                Click.on(UTestSignUp.BUTTON_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(UTestSignUp.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_MOBILE_DEVICE),
                Click.on(UTestSignUp.BUTTON_MODEL_DEVICE),
                Enter.theValue(strModel).into(UTestSignUp.INPUT_MODEL_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_MODEL_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_MODEL_DEVICE),
                Click.on(UTestSignUp.BUTTON_MOBILE_DEVICE_OS),
                Enter.theValue(strMobileOs).into(UTestSignUp.INPUT_MOBILE_DEVICE_OS),
                Hit.the(Keys.DOWN).keyIn(UTestSignUp.INPUT_MOBILE_DEVICE_OS),
                Hit.the(Keys.ENTER).keyIn(UTestSignUp.INPUT_MOBILE_DEVICE_OS),
                Click.on(UTestSignUp.BUTTON_LAST_STEP),
                Enter.theValue(strPassword).into(UTestSignUp.PASSWORD_USER),
                Enter.theValue(strPassword).into(UTestSignUp.PASSWORD_USER_CONFIRMATION),
                Click.on(UTestSignUp.BUTTON_STAY_INFORMED),
                Click.on(UTestSignUp.BUTTON_TERMS),
                Click.on(UTestSignUp.BUTTON_PRIVACY_POLICY),
                Click.on(UTestSignUp.BUTTON_COMPLETE),
                WaitUntil.the(UTestSignUp.COMPLETED_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(50).seconds());
    }
}
