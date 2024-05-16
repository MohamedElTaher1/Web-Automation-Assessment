package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static pages.P01_Register.CheckInvalidUserName;
import static pages.P02_BuyProduct.*;

public class InvalidUserName {


    @Given("I enter invalid username {string}")
    public void InvalidUser(String string){
     Login.click();
     UserNameLogin.enterText("Moh@med");
     PasswordLogin.enterText("123");
    }


    @When("I click on the Login button")
    public void iClickOnLoginButton() {
        ClickLogin.click();
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeErrorMessage(String expectedMessage) {
        CheckInvalidUserName.ConfirmAlertMessage(expectedMessage);
    }
}
