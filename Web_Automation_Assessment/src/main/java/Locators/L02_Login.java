package Locators;

import org.openqa.selenium.By;

public class L02_Login {
    /**
     * Links
     * **/
    public static By loginLink = By.id("login2");
    public static By CheckLogIn = By.id("nameofuser");
    public static By LapTopButton = By.xpath("//a[contains(text(),'Laptops')]");
    public static By SonyVaioi5 = By.xpath("//a[contains(text(),'Sony vaio i5')]");
    public static By SonyVaioi7 = By.xpath("//a[contains(text(),'Sony vaio i7')]");
    public static By HomeButton = By.xpath("(//a[@class='nav-link'])[1]");
    public static By CartHeader = By.id("cartur");
    /**
     * Fields
     * **/

    public static By UserNameField = By.id("loginusername");
    public static By PasswordField = By.id("loginpassword");
    public static By NameField = By.xpath("//input[@id='name']");
    public static By CountryField = By.xpath("//input[@id='country']");
    public static By CityField = By.xpath("//input[@id='city']");
    public static By CreditCardField = By.xpath("//input[@id='card']");
    public static By MonthField = By.xpath("//input[@id='month']");
    public static By YearField = By.xpath("//input[@id='year']");
    /**
     * Buttons
     * **/
    public static By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    public static By AddToCart = By.xpath("//a[contains(text(),'Add to cart')]");
    public static By PlaceOrderButton = By.xpath("//button[contains(@class,'btn-success')]");
    public static By Purchase = By.xpath("//button[@onclick='purchaseOrder()']");
    public static By OkButton = By.xpath("//button[contains(@class,'confirm btn btn-lg btn-primary')]");
    /**
     * Text
     * **/
    public static By Price1 = By.xpath("(//td[text()='790'])[1]");
    public static By Price2 = By.xpath("(//td[text()='790'])[2]");
    public static By SonyVaioCart = By.xpath("//td[contains(text(),'Sony vaio i5')]");
    public static By SonyVaioCart2 = By.xpath("//td[contains(text(),'Sony vaio i7')]");
    public static By TotalPrice = By.id("totalp");
    public static By PlaceOrderTotalPrice = By.id("totalm");

    /**
     * Messages
     * **/
    public static By validationMessage = By.xpath("//h2[text()='Thank you for your purchase!']");

}
