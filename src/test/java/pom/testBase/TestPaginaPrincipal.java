package pom.testBase;

import org.openqa.selenium.remote.RemoteWebDriver;
import pom.autenticar.IniciarSesion;
import pom.buscador.Buscador;
import pom.pagina_principal.PantallaPrincipal;
import stepdefinitions.CarguePaginaPrincipal;

public class TestPaginaPrincipal {

    public RemoteWebDriver remoteWebDriver = CarguePaginaPrincipal.getDriver();
    public IniciarSesion iniciarSesion = new IniciarSesion(remoteWebDriver);
    public PantallaPrincipal camisetas = new PantallaPrincipal(remoteWebDriver);
    public Buscador buscador = new Buscador(remoteWebDriver);

}
