package Locators;

import org.openqa.selenium.By;

public class L01_Register {
    /**
     * Fields
     * **/

    public static By usernameField = By.id("sign-username");

    public static By passwordField = By.id("sign-password");

    /**
     * Buttons
     * **/
    public static By signUpButton = By.xpath("(//button[@class=\"btn btn-primary\"])[2]");

    /**
     * Links
     * **/
    public static By SignUpLink =By.id("signin2");

    public static By logoutLink = By.id("logout2");
    /**
     * Messages
     * **/
    public static By successMessage = By.xpath("//*[contains(text(), 'registration completed')]");
}
