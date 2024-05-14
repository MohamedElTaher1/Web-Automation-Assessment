package org.example.StepDefinitions;

import org.openqa.selenium.By;

public class Locators {

  /**
   * SignUp
   * **/
  public static By SignIn =By.id("signin2");
  public static By UserNameGen = By.id("sign-username");
  public static By PasswordGen = By.id("sign-password");
  public static By SignInButton = By.xpath("(//button[@class=\"btn btn-primary\"])[2]");

  /**
   * LogIn
    * **/
  public static By LogIn = By.id("login2");
  public static By UserNameField = By.id("loginusername");
  public static By PasswordField = By.id("loginpassword");
  public static By LogInButton = By.xpath("//button[contains(text(),'Log in')]");
  public static By LapTopButton = By.xpath("//a[contains(text(),'Laptops')]");
  public static By SonyVaioi5 = By.xpath("//a[contains(text(),'Sony vaio i5')]");
  public static By AddToCart = By.xpath("//a[contains(text(),'Add to cart')]");
  public static By SonyVaioi7 = By.xpath("//a[contains(text(),'Sony vaio i7')]");
  public static By CartHeader = By.id("cartur");
  public static By TotalPrice = By.id("totalp");
  public static By PlaceOrderButton = By.xpath("//button[contains(@class,'btn-success')]");
  public static By PlaceOrderTotalPrice = By.id("totalm");
  public static By NameField = By.xpath("//input[@id='name']");
  public static By CountryField = By.xpath("//input[@id='country']");
  public static By CityField = By.xpath("//input[@id='city']");
  public static By CreditCardField = By.xpath("//input[@id='card']");
  public static By MounthField = By.xpath("//input[@id='month']");
  public static By YearField = By.xpath("//input[@id='year']");
  public static By Purchase = By.xpath("(//button[@type='button' and @onclick='purchaseOrder()' and @class='btn btn-primary'])[1]");
  public static By ConfirmationMessage = By.xpath("//h2[text()='Thank you for your purchase!']");
  public static By OkButton = By.xpath("//button[contains(@class,'confirm btn btn-lg btn-primary')]");

}
