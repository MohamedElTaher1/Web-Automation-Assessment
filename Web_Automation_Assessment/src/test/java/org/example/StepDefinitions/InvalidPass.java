package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static pages.P01_Register.CheckInvalidPassword;
import static pages.P02_BuyProduct.*;


public class InvalidPass {


    @Given("I enter invalid password {string}")
    public void iEnterInvalidPassword(String string) {
        Login.click();
        UserNameLogin.enterText("123");
        PasswordLogin.enterText("123456");
    }

    @When("I click on  Login button")
    public void iClickOnLoginButton() {
        ClickLogin.click();
    }

    @Then("I should see  error message {string}")
    public void iShouldSeeErrorMessage(String expectedMessage) {
        CheckInvalidPassword.ConfirmAlertMessage(expectedMessage);
    }
}
