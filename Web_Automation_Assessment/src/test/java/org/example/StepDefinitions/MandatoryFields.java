package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.example.StepDefinitions.Hook.userInfo;
import static pages.P02_BuyProduct.*;

public class MandatoryFields {
    @And("I fill in  place order without UserName and CreditCard form")
    public void FillForm(){
        CustomerCountry.enterText(userInfo.getTestData("Country"));
        CustomerCity.enterText(userInfo.getTestData("City"));
        CreditCardMonth.enterText(userInfo.getTestData("Month"));
        CreditCardYear.enterText(userInfo.getTestData("Year"));

    }
    @Then("I validate that {string} Alert is displayed")
    public void validateTextDisplayed(String expectedText) {
        ConfirmFormAlret.ConfirmAlertMessage(expectedText);
        ConfirmFormAlret.AcceptAlert();
    }




}
