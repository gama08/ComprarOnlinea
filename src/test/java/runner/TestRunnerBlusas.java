package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/navegar.feature",
        glue = {"stepdefinitions"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reporte-cucumber/reportBlusas.html"},
        tags = "@blusas"
)
public class TestRunnerBlusas {
}
