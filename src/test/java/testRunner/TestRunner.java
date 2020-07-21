package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "H:\\Flutter_projects\\BDDDemo\\src\\test\\resources\\WelcomePage.feature",
        features ="/home/chamodi/Languages/Mavan/GOV/src/test/resources/WelcomePage.feature",
        glue = "stepDefinition"
)
public class TestRunner {


}