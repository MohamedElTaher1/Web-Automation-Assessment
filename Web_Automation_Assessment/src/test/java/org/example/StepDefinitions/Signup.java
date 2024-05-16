package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import com.github.javafaker.Faker;
import static pages.P01_Register.*;


public class Signup {


    @Given("I click on the Sign up button in the Header")
    public void i_click_on_the_sign_up_button_in_the_header() {
        SignUp.click();
    }

    @When("I fill in the username and password in the sign up form")
    public void i_fill_in_the_username_and_password_in_the_sign_up_form() {
        Faker Object = new Faker();
        String FakerUserName = Object.name().name();
        String FakerPassword = Object.internet().password();
        JsonFileModifier.modifyValue("src/test/resources/DynamicData.json","UserName1",FakerUserName);
        JsonFileModifier.modifyValue("src/test/resources/DynamicData.json","Password",FakerPassword);
        Username.enterText(FakerUserName);
        Password.enterText(FakerPassword);

    }
    @And("I submit the sign up form")
    public void i_submit_the_sign_up_form() {
       Confirm.click();
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expectedMessage) {
       SignUpAlert.ConfirmAlertMessage(expectedMessage);
       SignUpAlert.AcceptAlert();
    }
}

