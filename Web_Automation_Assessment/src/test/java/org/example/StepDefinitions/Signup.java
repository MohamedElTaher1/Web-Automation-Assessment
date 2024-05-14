package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.example.StepDefinitions.Hook.driver;
import static org.example.StepDefinitions.Locators.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class Signup {

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        String siteURL = "https://www.demoblaze.com/index.html";
        String siteTitle = "STORE";

        // Go to the website
        driver.browser().navigateToURL(siteURL);

        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();
    }

    @When("I click on the Sign up button in the Header")
    public void i_click_on_the_sign_up_button_in_the_header() {
       driver.element().click(SignIn);
    }

    @And("I fill in the username and password in the sign up form")
    public void i_fill_in_the_username_and_password_in_the_sign_up_form() {
        Faker Object = new Faker();
        String UserName = Object.name().name();
        String Password = Object.internet().password();
        JsonFileModifier.modifyValue("src/test/resources/DynamicData.json","UserName1",UserName);
        JsonFileModifier.modifyValue("src/test/resources/DynamicData.json","Password",Password);
        driver.element().type(UserNameGen,UserName);
        driver.element().type(PasswordGen,Password);

    }

    @And("I submit the sign up form")
    public void i_submit_the_sign_up_form() {

        driver.element().click(SignInButton);
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expectedMessage) throws InterruptedException {

        Wait<WebDriver> wait =
                new FluentWait<>(driver.getDriver())
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(NoAlertPresentException.class);

        wait.until(
                d -> {
                     driver.getDriver().switchTo().alert().getText();
                return true;
                });

        Alert confirmAlert = driver.getDriver().switchTo().alert();
        String alertText = confirmAlert.getText();
        Assert.assertEquals(alertText,expectedMessage);
        confirmAlert.accept();
        // System.out.println("Confirmation Alert Text: " + alertText);
       // Hook.driver.alert().acceptAlert();
      //  String AlertMessage =  Hook.driver.alert().getAlertText();
      //  Assert.assertEquals(expectedMessage,AlertMessage);


    }
}

