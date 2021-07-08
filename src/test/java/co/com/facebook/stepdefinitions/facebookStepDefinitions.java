package co.com.facebook.stepdefinitions;

import co.com.facebook.model.FacebookModel;
import co.com.facebook.tasks.Login;
import co.com.facebook.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class facebookStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^miguel enter the valid credentials$")
    public void miguelEnterTheValidCredentials(List<FacebookModel> facebookModel) throws Exception {
    OnStage.theActorCalled("Miguel").wasAbleTo(OpenUp.thePage(), Login.
            onThePage(facebookModel.get(0).getStrEmail(),facebookModel.get(0).getStrPass()));

    }
}
