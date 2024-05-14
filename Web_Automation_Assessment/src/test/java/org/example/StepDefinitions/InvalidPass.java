package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.StepDefinitions.Hook.driver;
import static org.example.StepDefinitions.Locators.*;

public class InvalidPass {
    @Given("I am on  homepageLogin")
    public void iAmOnHomepageLogin() {
        String siteURL = "https://www.demoblaze.com/index.html";
        String siteTitle = "STORE";

        // Go to the website
        driver.browser().navigateToURL(siteURL);

        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();
    }

    @When("I enter invalid password {string}")
    public void iEnterInvalidPassword(String string) {
        driver.element().click(LogIn);
        driver.element().type(UserNameField,"123");
        driver.element().type(PasswordField,string);
    }

    @And("I click on  Login button")
    public void iClickOnLoginButton() {
        driver.element().click(LogInButton);
    }

    @Then("I should see  error message {string}")
    public void iShouldSeeErrorMessage(String expectedMessage) {
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
    }
}
