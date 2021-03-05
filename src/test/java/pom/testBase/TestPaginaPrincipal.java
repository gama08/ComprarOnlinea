package pom.testBase;

import org.openqa.selenium.remote.RemoteWebDriver;
import pom.autenticar.IniciarSesion;
import stepdefinitions.CarguePaginaPrincipal;

public class TestPaginaPrincipal {

    public RemoteWebDriver remoteWebDriver = CarguePaginaPrincipal.getDriver();
    public IniciarSesion iniciarSesion = new IniciarSesion(remoteWebDriver);

}