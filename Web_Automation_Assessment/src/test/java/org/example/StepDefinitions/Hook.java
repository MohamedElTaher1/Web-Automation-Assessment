package org.example.StepDefinitions;

import com.shaft.driver.SHAFT;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.DriverManager;

import javax.ws.rs.core.Form;

public class Hook {

    public static SHAFT.GUI.WebDriver driver;
    public static SHAFT.TestData.JSON userInfo;
   // static Form form;
    @Before

    public static void OpenBrowser(){
        // Create new driver object
       /* driver = new SHAFT.GUI.WebDriver();
         // Extract user information
        */
        userInfo = new SHAFT.TestData.JSON("src/test/resources/DynamicData.json");
        // Create a form object to be used to fill out form fields
        DriverManager.startDriverSession();

    }
    @After

    public static void CloseBrowser(){
       // Quit the WebDriver instance
     //   driver.quit();
        DriverManager.EndDriverSession();
        SHAFT.Properties.reporting.openAllureReportAfterExecution();

    }
}
