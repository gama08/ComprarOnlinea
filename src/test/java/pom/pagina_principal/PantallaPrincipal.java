package pom.pagina_principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.selenium.FuncionesSelenium;

public class PantallaPrincipal extends FuncionesSelenium {

    private final int TIEMPO_ESPERA = 30;
    private By tituloPantalla = By.className("cat-name");

    private By opcionCamisetas = By.linkText("T-SHIRTS");

    private By menuBlusas = By.linkText("WOMEN");
    private By opcionBlusas = By.linkText("Blouses");


    private By menuVestidos = By.linkText("DRESSES");
    private By opcionVestidosCasuales = By.linkText("CASUAL DRESSES");

    private By opcionVestidosNoche = By.linkText("EVENING DRESSES");

    private By opcionVestidosVerano = By.linkText("SUMMER DRESSES");


    public PantallaPrincipal(RemoteWebDriver remoteWebDriver){
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
        tiempoEmperaElementoVisible(tituloPantalla, TIEMPO_ESPERA);
        String tituloPagina = getText(tituloPantalla);
        if (!tituloPagina.equals("T-SHIRTS ")){
            throw new Exception("No se encontró el titulo con el nombre T-shrts: ");
        }
    }

    public void navegarPaginaBlusas(){
        tiempoEmperaElementoVisible(menuBlusas,TIEMPO_ESPERA);
        moverCursor(menuBlusas);

    }

    public void seleccionarOpcionBlusas(){
        tiempoEmperaElementoVisible(opcionBlusas, TIEMPO_ESPERA);
        String nombreOpcion = getText(opcionBlusas);
        if (nombreOpcion.equals("Blouses")){
            click(opcionBlusas);
        }
    }

    public void confirmarIngresoPantallaBlusas() throws Exception {
        tiempoEmperaElementoVisible(tituloPantalla, TIEMPO_ESPERA);
        String titulo = getText(tituloPantalla);
        if (!titulo.equals("BLOUSES ")){
            throw new Exception("No se encontró el titulo con el nombre BLOUSES:");
        }
    }
    public void navegarPaginaVestidosCasuales(){
        tiempoEmperaElementoVisible(menuVestidos, TIEMPO_ESPERA);
        moverCursor(menuVestidos);
    }
    public void seleccionarOpcionVestidosCasuales(){
        tiempoEmperaElementoVisible(opcionVestidosCasuales, TIEMPO_ESPERA);
        String nombreOpcion = getText(opcionVestidosCasuales);
        if (nombreOpcion.equals("CASUAL DRESSES")){
            click(opcionVestidosCasuales);
        }
    }
    public void confirmarIngresoPantallaVestidosCasuales() throws Exception {
        tiempoEmperaElementoVisible(tituloPantalla, TIEMPO_ESPERA);
        String titulo = getText(tituloPantalla);
        if (!titulo.equals("CASUAL DRESSES ")){
            throw new Exception("No se encontró el titulo con el nombre BLOUSES:");
        }
    }
    public void navegarPaginaVestidosNoche(){
        tiempoEmperaElementoVisible(menuVestidos, TIEMPO_ESPERA);
        moverCursor(menuVestidos);
    }

    public void seleccionarOpcionVestidosNoche(){
        tiempoEmperaElementoVisible(opcionVestidosNoche, TIEMPO_ESPERA);
        String nombreOpcion = getText(opcionVestidosNoche);
        if (nombreOpcion.equals("EVENING DRESSES")){
            click(opcionVestidosNoche);
        }
    }

    public void confirmarIngresoPantallaVestidosNoche() throws Exception {
        tiempoEmperaElementoVisible(tituloPantalla, TIEMPO_ESPERA);
        String titulo = getText(tituloPantalla);
        if (!titulo.equals("EVENING DRESSES ")){
            throw new Exception("No se encontró el titulo con el nombre BLOUSES:");
        }
    }

    public void navegarPaginaVestidosVerano(){
        tiempoEmperaElementoVisible(menuVestidos, TIEMPO_ESPERA);
        moverCursor(menuVestidos);
    }

    public void seleccionarOpcionVestidosVerano(){
        tiempoEmperaElementoVisible(opcionVestidosVerano, TIEMPO_ESPERA);
        String nombreOpcion = getText(opcionVestidosVerano);
        if (nombreOpcion.equals("SUMMER DRESSES")){
            click(opcionVestidosVerano);
        }
    }

    public void confirmarIngresoPantallaVestidosVerano() throws Exception {
        tiempoEmperaElementoVisible(tituloPantalla, TIEMPO_ESPERA);
        String titulo = getText(tituloPantalla);
        if (!titulo.equals("SUMMER DRESSES ")){
            throw new Exception("No se encontró el titulo con el nombre BLOUSES:");
        }
    }

    }
