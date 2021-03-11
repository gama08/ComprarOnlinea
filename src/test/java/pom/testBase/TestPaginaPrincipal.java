package pom.testBase;

import org.openqa.selenium.remote.RemoteWebDriver;
import pom.autenticar.IniciarSesion;
import pom.producto_camisetas.Camisetas;
import stepdefinitions.CarguePaginaPrincipal;

public class TestPaginaPrincipal {

    public RemoteWebDriver remoteWebDriver = CarguePaginaPrincipal.getDriver();
    public IniciarSesion iniciarSesion = new IniciarSesion(remoteWebDriver);
    public Camisetas camisetas = new Camisetas(remoteWebDriver);

}
