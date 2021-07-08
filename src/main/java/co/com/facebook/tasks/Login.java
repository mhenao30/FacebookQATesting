package co.com.facebook.tasks;

import co.com.facebook.userinterface.FacebookLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strEmail;
    private String strPass;

    public Login(String strEmail, String strPass) {
        this.strEmail = strEmail;
        this.strPass = strPass;
    }

    public static Login onThePage(String strEmail, String strPass){
        return Tasks.instrumented(Login.class, strEmail, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(strEmail).into(FacebookLoginPage.USER_EMAIL),
            Enter.theValue(strPass).into(FacebookLoginPage.USER_PASS),
            Click.on(FacebookLoginPage.BTN_LOGIN)
    );
    }
}
