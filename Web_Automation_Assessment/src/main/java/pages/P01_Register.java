package pages;
import coreElements.*;
import static Locators.L01_Register.*;

public class P01_Register {
    public static Link SignUp = new Link(SignUpLink);
    public static Link  Logout = new Link(logoutLink);
    public static FormField Username = new FormField(usernameField);

    public static FormField Password = new FormField(passwordField);
    public static Button Confirm = new Button(signUpButton);
    public static Alerts SignUpAlert = new Alerts();
    public static Alerts CheckInvalidUserName = new Alerts();
    public static Alerts CheckInvalidPassword = new Alerts();
}