package runner.browser;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverManager {

    protected RemoteWebDriver remoteWebDriver;

    protected abstract void crearDriver();

    public void cerrarDriver(){
        if (remoteWebDriver != null){
            remoteWebDriver.quit();
            remoteWebDriver = null;
        }
    }

    public RemoteWebDriver levantarDriver(){
        if (remoteWebDriver == null){
            crearDriver();
        }

        return remoteWebDriver;
    }
}
