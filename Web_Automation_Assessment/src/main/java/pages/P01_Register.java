package pages;

import Locators.L01_Register;
import coreElements.*;
import org.openqa.selenium.Alert;

import static Locators.L01_Register.*;

public class P01_Register {
    public static Link SignUp = new Link(SignUpLink);
    public static Link  Logout = new Link(logoutLink);
    public static FormField Username = new FormField(usernameField);

    public static FormField Password = new FormField(passwordField);
    public static Button Confirm = new Button(signUpButton);
    public static Alerts SignUpAlert = new Alerts();
}