package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static pages.P02_Login.*;
import static org.example.StepDefinitions.Hook.driver;
import static org.example.StepDefinitions.Hook.userInfo;
import static org.example.StepDefinitions.Locators.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BuyProduct {

    int Total;
    @Given("I am on the homepage2")
    public void iAmOnHomepage() {
       /* String siteURL = "https://www.demoblaze.com/index.html";
        String siteTitle = "STORE";

        // Go to the website
        driver.browser().navigateToURL(siteURL);

        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();*/
    }

    @When("I click on Login button in Header")
    public void clickLoginButton() {
      //driver.element().click(LogIn);
  Login.click();
    }

    @And("I fill in username  and password  in Login Form")
    public void fillLoginForm() {
      String UserName =   userInfo.getTestData("UserName1");
      String Password =  userInfo.getTestData("Password");
      /*driver.element().type(UserNameField,UserName);
      driver.element().type(PasswordField, Password);
      driver.element().click(LogInButton);*/
        UserNameLogin.enterText(UserName);
        PasswordLogin.enterText(Password);
        ClickLogin.click();

    }
    @And("I validate that account is opened Successfully")
    public void ValidateLogIn(){

      // driver.assertThat().element(CheckLogIn).exists().perform();
     ConfirmLogIn.ValidateLinkExist();

    }
    @And("I click on Laptops in categories on home page")
    public void ClickOnLapTop(){

        //driver.element().click(LapTopButton);
        ClickOnLapTop.click();
    }
    @And("I choose product one")
    public void ProductOne(){

      //  driver.element().click(SonyVaioi5);
        ClickOnSonyVaioi5.click();

    }
    @And("I click on Add to cart button for product one")
    public void AddToCartOne(){
      //  driver.element().click(AddToCart);
        AddItemToCart.click();
    }
    @And("I validate that product one is successfully added to cart")
    public void ValidateAddToCart() {

        /*Wait<WebDriver> wait =
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
        confirmAlert.accept();*/
        ProductAddedAlert.AcceptAlert();
    }
    @And("I choose product two")
    public void ProductTwo(){
        /*driver.element().click(HomeButton);
        driver.element().click(LapTopButton);
        driver.element().click(SonyVaioi7);*/
        ClickOnHomePage.click();
        ClickOnLapTop.click();
        ClickOnSonyVaioi7.click();
    }
    @And("I click on Add to cart button for product two")
    public void AddToCartTwo(){
      //  driver.element().click(AddToCart);
        AddItemToCart.click();
    }
    @And("I validate that product two is successfully added to cart")
    public void ValidateAddToCart2(){

       /* Wait<WebDriver> wait =
                new FluentWait<>(driver.getDriver())
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(NoAlertPresentException.class);

        wait.until(
                d -> {
                    driver.getDriver().switchTo().alert().getText();
                    return true;
                });*/
        /*Alert confirmAlert = driver.getDriver().switchTo().alert();
        String alertText = confirmAlert.getText();
        confirmAlert.accept();*/
        ProductAddedAlert.AcceptAlert();
    }
    @And("I click on Cart button in header")
    public void CartButton(){
      //  driver.element().click(CartHeader);
        ClickOnCartHeader.click();
    }
    @Then("I validate that both products are successfully added in products page")
    public void ValidateProducts(){
       /* driver.assertThat().element(SonyVaioCart).text().isEqualTo("Sony vaio i5").perform();
        driver.assertThat().element(SonyVaioCart2).text().isEqualTo("Sony vaio i7").perform();*/
        SonyVaioi5Price.validateCriticalTextExists();
        SonyVaioi7Price.validateCriticalTextExists();

    }
   @And("I validate that the total amount is calculated correctly")
   public void ValidateTotalPrice(){

       int LaptopPrice1 = Integer.parseInt(SonyVaioi5Price.GetText());
       int LaptopPrice2 = Integer.parseInt(SonyVaioi7Price.GetText());
        Total = LaptopPrice1+LaptopPrice2;
      // driver.assertThat().element(TotalPrice).text().isEqualTo(Total).perform();
       TotalCartPrice.ValidateTextContains(String.valueOf(Total));

   }
   @And("I click on Place order button")
   public void PlaceOrder(){
       // driver.element().click(PlaceOrderButton);
        ClickOnPlaceOrder.click();
   }
   @And("I validate that the total amount is calculated correctly in place order page")
   public void PlaceOrderTotal(){

     //  driver.assertThat().element(PlaceOrderTotalPrice).text().contains(Total).perform();
       PlaceOrdertotalprice.ValidateTextContains(String.valueOf(Total));
   }
   @And("I fill in  place order form")
   public void FillForm(){
/*
       driver.element().type(NameField,userInfo.getTestData("Name"));
       driver.element().type(CountryField,userInfo.getTestData("Country"));
       driver.element().type(CityField,userInfo.getTestData("City"));
       driver.element().type(CreditCardField,userInfo.getTestData("CreditCard"));
       driver.element().type(MounthField,userInfo.getTestData("Month"));
       driver.element().type(YearField,userInfo.getTestData("Year"));
*/
       CustomerName.enterText(userInfo.getTestData("Name"));
       CustomerCountry.enterText(userInfo.getTestData("Country"));
       CustomerCity.enterText(userInfo.getTestData("City"));
       CustomerCreditCardNumber.enterText(userInfo.getTestData("CreditCard"));
       CreditCardMonth.enterText(userInfo.getTestData("Month"));
       CreditCardYear.enterText(userInfo.getTestData("Year"));

   }
   @And("I click on Purchase button in place order Form")
   public void PlaceOrderButton(){
      //  driver.element().click(Purchase);
       PlaceOrderConfirmButton.click();
   }

    @Then("I validate that {string} is displayed")
    public void validateTextDisplayed(String expectedText) {
      //  driver.assertThat().element(ConfirmationMessage).exists().perform();
        ConfirmOrderMessage.ValidateTextContains(expectedText);
       // driver.element().click(OkButton);
        ClickOnOkButton.click();
    }
}
