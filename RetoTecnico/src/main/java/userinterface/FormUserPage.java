package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormUserPage {

    public static final Target BTN_JOIN = Target.the("BTN JOIN")
                    .located(org.openqa.selenium.By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last-name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH_OF_BIRTH = Target.the("where do we write the month of birth")
            .locatedBy("//*[@id='birthMonth']/option[contains(text(),'{0}')]");
    public static final Target INPUT_DAY_OF_BIRTH = Target.the("where do we write the day of birth")
            .locatedBy("//*[@id='birthDay']/option[contains(text(),'{0}')]");
    public static final Target INPUT_YEAR_OF_BIRTH = Target.the("where do we write the year of birth")
            .locatedBy("//*[@id='birthYear']/option[contains(text(),'{0}')]");
    public static final Target BUTTON_NEXT_LOCATION = Target.the("button Next Location")
            .located(org.openqa.selenium.By.xpath("//a[@class='btn btn-blue']"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("button Next Devices")
            .located(org.openqa.selenium.By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target OPERATIVE_SYSTEM = Target.the("OS")
            .locatedBy("//span[@class='ui-select-choices-row-inner']/div[contains(text(),'{0}')]");
    public static final Target VERSION_OPERATIVE_SYSTEM = Target.the("language OS")
            .locatedBy("//span[@class='ui-select-match-text pull-left ui-select-allow-clear'][contains(text(),'{0}')]");
    public static final Target LANGUAGE = Target.the("language OS")
            .locatedBy("//span[@class='ui-select-match-text pull-left ui-select-allow-clear'][contains(text(),'{0}')]");
    public static final Target BUTTON_NEXT_LAST_SETUP = Target.the("button NEXT_LAST_SETUP")
            .located(org.openqa.selenium.By.xpath("//*[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write confirm  password")
            .located(By.id("confirmPassword"));
    public static final Target CODE_CONDUCT = Target.the("where do we write the CODE_CONDUCT")
            .located(By.id("termOfUse"));
    public static final Target SECURITY_POLICY = Target.the("where do we write the security policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_FINISH = Target.the("Complete Setup")
            .located(By.id("laddaBtn"));
    public static final Target CAPTCHA_UTEST = Target.the("Welcome")
            .locatedBy("//*[@id='rc-imageselect']/div[2]/div[1]/div[1]/div/text()");





}
