package pages;

import com.shaft.driver.SHAFT;
import coreElements.Alerts;
import coreElements.Element;
import coreElements.Text;

public class DriverManager {
    public static SHAFT.GUI.WebDriver driver;

    public static void startDriverSession(){
          String siteURL = "https://www.demoblaze.com/index.html";
        String siteTitle = "STORE";
        // Create new driver object
        driver = new SHAFT.GUI.WebDriver();
        Element.setDriver(driver);
        Text.setDriver(driver);
        Alerts.setDriver(driver);
        // Go to the website
        driver.browser().navigateToURL(siteURL);
        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();
    }

    public static void EndDriverSession(){
        // Quit the WebDriver instance
        driver.quit();
    }
}
