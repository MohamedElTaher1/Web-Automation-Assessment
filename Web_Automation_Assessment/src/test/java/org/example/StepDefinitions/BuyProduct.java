package org.example.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static pages.P02_BuyProduct.*;
import static org.example.StepDefinitions.Hook.userInfo;

public class BuyProduct {

    int Total;

    @Given("I click on Login button in Header")
    public void clickLoginButton() {
    Login.click();
    }

    @When("I fill in username  and password  in Login Form")
    public void fillLoginForm() {
      String UserName =   userInfo.getTestData("UserName1");
      String Password =  userInfo.getTestData("Password");
        UserNameLogin.enterText(UserName);
        PasswordLogin.enterText(Password);
        ClickLogin.click();

    }
    @And("I validate that account is opened Successfully")
    public void ValidateLogIn(){

     ConfirmLogIn.ValidateLinkExist();

    }
    @And("I click on Laptops in categories on home page")
    public void ClickOnLapTop(){

        ClickOnLapTop.click();
    }
    @And("I choose product one")
    public void ProductOne(){

        ClickOnSonyVaioi5.click();

    }
    @And("I click on Add to cart button for product one")
    public void AddToCartOne(){
        AddItemToCart.click();
    }
    @And("I validate that product one is successfully added to cart")
    public void ValidateAddToCart() {
        ProductAddedAlert.AcceptAlert();
    }
    @And("I choose product two")
    public void ProductTwo(){
        ClickOnHomePage.click();
        ClickOnLapTop.click();
        ClickOnSonyVaioi7.click();
    }
    @And("I click on Add to cart button for product two")
    public void AddToCartTwo(){
        AddItemToCart.click();
    }
    @And("I validate that product two is successfully added to cart")
    public void ValidateAddToCart2(){
        ProductAddedAlert.AcceptAlert();
    }
    @And("I click on Cart button in header")
    public void CartButton(){
        ClickOnCartHeader.click();
    }
    @Then("I validate that both products are successfully added in products page")
    public void ValidateProducts(){
        SonyVaioi5Price.validateCriticalTextExists();
        SonyVaioi7Price.validateCriticalTextExists();
        SonyVaioi5CartCheck.validateCriticalTextExists();
        SonyVaioi7CartCheck.validateCriticalTextExists();

    }
   @And("I validate that the total amount is calculated correctly")
   public void ValidateTotalPrice(){

       int LaptopPrice1 = Integer.parseInt(SonyVaioi5Price.GetText());
       int LaptopPrice2 = Integer.parseInt(SonyVaioi7Price.GetText());
        Total = LaptopPrice1+LaptopPrice2;
       TotalCartPrice.ValidateTextContains(String.valueOf(Total));

   }
   @And("I click on Place order button")
   public void PlaceOrder(){
        ClickOnPlaceOrder.click();
   }
   @And("I validate that the total amount is calculated correctly in place order page")
   public void PlaceOrderTotal(){
        PlaceOrdertotalprice.ValidateTextContains(String.valueOf(Total));
   }
   @And("I fill in  place order form")
   public void FillForm(){
       CustomerName.enterText(userInfo.getTestData("Name"));
       CustomerCountry.enterText(userInfo.getTestData("Country"));
       CustomerCity.enterText(userInfo.getTestData("City"));
       CustomerCreditCardNumber.enterText(userInfo.getTestData("CreditCard"));
       CreditCardMonth.enterText(userInfo.getTestData("Month"));
       CreditCardYear.enterText(userInfo.getTestData("Year"));

   }
   @And("I click on Purchase button in place order Form")
   public void PlaceOrderButton(){
       PlaceOrderConfirmButton.click();
   }

    @Then("I validate that {string} is displayed")
    public void validateTextDisplayed(String expectedText) {
        ConfirmOrderMessage.ValidateTextContains(expectedText);
        ClickOnOkButton.click();
    }
}
