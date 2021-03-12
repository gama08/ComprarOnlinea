package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import runner.browser.DriverManager;
import runner.browser.DriverManagerFactory;
import runner.browser.DriverType;

public class CarguePaginaPrincipal {

    private static RemoteWebDriver remoteWebDriver;
    private DriverManager driverManager;

    @Before
    public void ejecutarDePrimera(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        remoteWebDriver = driverManager.levantarDriver();
        //remoteWebDriver.get("http://automationpractice.com/index.php");
        //remoteWebDriver.manage().window().maximize();
    }
    @After
    public void terminarProceso(Scenario scenario){
        if (scenario.isFailed()){
            try {
               final byte[] screenshot = ((TakesScreenshot)remoteWebDriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "imagen/png");
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        driverManager.cerrarDriver();
    }

    public static RemoteWebDriver getDriver(){
        return remoteWebDriver;
    }
}
