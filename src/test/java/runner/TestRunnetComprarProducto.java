package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/realizar_pago.feature",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reporte-cucumber/reportCompraProductoBanco.html"},
        glue = "stepdefinitions"
)
public class TestRunnetComprarProducto {
}
