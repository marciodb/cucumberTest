package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature/login.feature",
        glue = {"step_definitions"}
        //format = {"pettry", "html:test-outout"}
    )
public class TestRunner {
}