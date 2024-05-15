package pages;

import coreElements.*;

import static Locators.L02_Login.*;
public class P02_Login {
    public static Link Login = new Link(loginLink);
    public static FormField UserNameLogin = new FormField(UserNameField);
    public static FormField PasswordLogin = new FormField(PasswordField);

    public static Button ClickLogin = new Button(loginButton);
    public static Link ConfirmLogIn = new Link(CheckLogIn);
    public static Link ClickOnLapTop = new Link(LapTopButton);
    public static Link ClickOnSonyVaioi5 = new Link(SonyVaioi5);
    public static Button AddItemToCart = new Button(AddToCart);
    public static Alerts ProductAddedAlert = new Alerts();
    public static Link ClickOnHomePage = new Link(HomeButton);

    public static Link ClickOnSonyVaioi7 = new Link(SonyVaioi7);
    public static Link ClickOnCartHeader = new Link(CartHeader);
    public static Text SonyVaioi5Price = new Text(Price1);
    public static Text SonyVaioi7Price = new Text(Price2);
    public static Text TotalCartPrice = new Text(TotalPrice);
    public static Button ClickOnPlaceOrder = new Button(PlaceOrderButton);
    public static Text PlaceOrdertotalprice = new Text(PlaceOrderTotalPrice);
    public static FormField CustomerName = new FormField(NameField);
    public static FormField CustomerCountry= new FormField(CountryField);
    public static FormField CustomerCity = new FormField(CityField);
    public static FormField CustomerCreditCardNumber = new FormField(CreditCardField);
    public static FormField CreditCardMonth = new FormField(MonthField);
    public static FormField CreditCardYear = new FormField(YearField);
    public static Button PlaceOrderConfirmButton = new Button(Purchase);
    public static Button ClickOnOkButton = new Button(OkButton);
    public static Text ConfirmOrderMessage = new Text(validationMessage);


}
