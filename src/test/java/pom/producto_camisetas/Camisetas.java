package pom.producto_camisetas;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.selenium.FuncionesSelenium;

public class Camisetas extends FuncionesSelenium {

    private final int TIEMPO_ESPERA = 30;
    private By opcionCamisetas = By.linkText("T-SHIRTS");
    private By tituloCamisetas = By.className("cat-name");

    public Camisetas(RemoteWebDriver remoteWebDriver){
        super(remoteWebDriver);

    }
    public void cargarPaginaPrincipal(String url){
        abrirNavegador(url);
    }

    public void navegarPaginaCamisetas()  {
        tiempoEmperaElementoVisible(opcionCamisetas, TIEMPO_ESPERA);
        click(opcionCamisetas);

    }
    public void confirmarIngresoMenuCamisetas() throws Exception{
        tiempoEmperaElementoVisible(tituloCamisetas, TIEMPO_ESPERA);
        String tituloPagina = getText(tituloCamisetas);
        if (!tituloPagina.equals("T-SHIRTS ")){
            throw new Exception("No se encontró el titulo con el nombre T-shrts: ");
        }
    }
}
