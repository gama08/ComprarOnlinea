package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/buscador.feature",
        glue = "stepdefinitions",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reporte-cucumber/reportBuscador.html"}

)
public class TestRunnerBuscador {
}
