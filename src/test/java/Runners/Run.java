package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        glue = {"helpers","StepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}