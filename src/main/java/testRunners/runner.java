package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"},
        tags = "@adressVerify",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
        }
)
public class runner extends AbstractTestNGCucumberTests { }