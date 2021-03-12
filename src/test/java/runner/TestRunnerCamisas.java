package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/navegar.feature",
        glue = "stepdefinitions",
        tags = "@camisas"
)
public class TestRunnerCamisas {
}
