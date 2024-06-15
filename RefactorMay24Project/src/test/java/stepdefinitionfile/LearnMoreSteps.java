package stepdefinitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class LearnMoreSteps {

    TestContext context;

    public LearnMoreSteps(TestContext context){

        this.context = context;

    }

    @Given("user click on confirmation box button")
    public void clickConfirmationBox(){
        context.pageObjectManager.getLearnMoreAlertPage().clickConfirmBoxButton();

    }

    @Then("user validate the alert message")
    public void userValidateTheAlertMessage() {
        String actualMessage = context.pageObjectManager.getLearnMoreAlertPage().getAlertBoxText();
        Assert.assertEquals("Press a Button !",actualMessage);

    }

    @And("user validate the UI message")
    public void userValidateTheUIMessage() {
        context.pageObjectManager.getLearnMoreAlertPage().clickCancelAlert();
        Assert.assertEquals("You Pressed Cancel",context.pageObjectManager.getLearnMoreAlertPage().getCancelTextMessageFromUI());

    }

    @Given("user clicks on change text button")
    public void userClicksOnChangeTextButton() {
        context.pageObjectManager.getLearnMoreExplicitPage().clickChangeTextButton();
        
    }

    @Then("validate the change text value")
    public void validateTheChangeTextValue() {
        Assert.assertEquals("Hello, Learn More Aspirants",context.pageObjectManager.getLearnMoreExplicitPage().getChangeText());
    }
}
