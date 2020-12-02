package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UserTestmyPage;


public class OpenUp implements Task {

    private UserTestmyPage userTestmyPage;

    public static OpenUp ThePage() {

        return instrumented(OpenUp.class);

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(userTestmyPage));
    }
}



