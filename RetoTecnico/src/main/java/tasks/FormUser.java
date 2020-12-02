package tasks;

import interactions.Wait;
import model.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FormUserPage;

import java.util.List;


public class FormUser implements Task {

    private String name;
    private String last_name;
    private String email;
    private String month_of_birth;
    private String day_birth;
    private String year_birth;
    private String operative_system;
    private String version_operative_system;
    private String language;
    private String password;
    private String password_confirmation;

    public FormUser(String name, String last_name, String email, String month_of_birth, String day_birth, String year_birth, String operative_system, String version_operative_system, String language, String password, String password_confirmation) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.month_of_birth = month_of_birth;
        this.day_birth = day_birth;
        this.year_birth = year_birth;
        this.operative_system = operative_system;
        this.version_operative_system = version_operative_system;
        this.language = language;
        this.password = password;
        this.password_confirmation = password_confirmation;
    }






    private FormUserPage formUserPage;

    public static FormUser The(String name,String last_name,String email,String month_of_birth,String day_birth,
                                   String year_birth,String operative_system,String version_operative_system,
                                   String language,String password,String password_confirmation) {

        return Tasks.instrumented(FormUser.class,name,last_name,email,month_of_birth,day_birth,year_birth,operative_system,
                version_operative_system,language,password,password_confirmation);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(formUserPage.BTN_JOIN),
                    Enter.theValue(name).into(formUserPage.INPUT_NAME),
                    Enter.theValue(last_name).into(formUserPage.INPUT_LAST_NAME),
                    Enter.theValue(email).into(formUserPage.INPUT_EMAIL),
                    Click.on(formUserPage.INPUT_MONTH_OF_BIRTH.of(month_of_birth)),
                    Click.on(formUserPage.INPUT_DAY_OF_BIRTH.of(day_birth)),
                    Click.on(formUserPage.INPUT_YEAR_OF_BIRTH.of(year_birth)),
                    Click.on(formUserPage.BUTTON_NEXT_LOCATION),
                    Click.on(formUserPage.BUTTON_NEXT_DEVICES),
                    Click.on(formUserPage.BUTTON_NEXT_LAST_SETUP),
                    Enter.theValue(password).into(formUserPage.INPUT_PASSWORD),
                    Enter.theValue(password_confirmation).into(formUserPage.INPUT_CONFIRM_PASSWORD),
                    Click.on(formUserPage.CODE_CONDUCT),
                    Click.on(formUserPage.SECURITY_POLICY),
                    Click.on(formUserPage.BUTTON_FINISH)
                    );


    }
}
