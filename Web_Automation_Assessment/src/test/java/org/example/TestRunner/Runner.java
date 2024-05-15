package org.example.TestRunner;


import com.shaft.properties.internal.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "org/example",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
        },

        tags = "@Smoke"
)
public class Runner extends AbstractTestNGCucumberTests {

}
