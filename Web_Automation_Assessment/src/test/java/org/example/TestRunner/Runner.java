package org.example.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/testDataFiles",
        glue = "org.example.StepDefinitions",
        tags = "@test",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"


        }
)
public class Runner extends AbstractTestNGCucumberTests {

}
