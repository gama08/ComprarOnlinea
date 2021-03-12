package pom.buscador;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.selenium.FuncionesSelenium;

import java.util.List;

public class Buscador extends FuncionesSelenium {

    private final int TIEMPO_ESPERA = 30;
    private String palabraBuscar = "blouse";

    By buscador = By.id("search_query_top");
    By btnBuscador = By.name("submit_search");
    By resultadosBusqueda = By.className("heading-counter");
    By mensajePrendaNoExistente = By.className("alert-warning");


    public Buscador(RemoteWebDriver remoteWebDriver){
        super(remoteWebDriver);
    }
    public void cargarPaginaPrincipal(String url){
        abrirNavegador(url);
    }

    public void ingresarPrendaBuscar() throws Exception {
        tiempoEmperaElementoVisible(buscador,TIEMPO_ESPERA);
        teclear(palabraBuscar, buscador);

    }

    public void buscarPrenda(){
        tiempoEmperaElementoVisible(btnBuscador, TIEMPO_ESPERA);
        click(btnBuscador);
    }

    public void validarPrendasEncontradas() throws Exception {
        tiempoEmperaElementoVisible(resultadosBusqueda, TIEMPO_ESPERA);
        String textoResultado = getText(resultadosBusqueda);
        if (textoResultado.equals("0 results have been found.")){
            throw new Exception("No se encontro resultados con una prenda que debe existir: ");
        }

    }
    public void ingresarPrendaNoExistente(){
        palabraBuscar = "ZAPATOS ROJOS";
        tiempoEmperaElementoVisible(buscador, TIEMPO_ESPERA);
        teclear(palabraBuscar, buscador);
    }

    public void validarMesajePrendaNoExistente() throws Exception {
        tiempoEmperaElementoVisible(mensajePrendaNoExistente, TIEMPO_ESPERA);
        String textoResultado = getText(mensajePrendaNoExistente);
        if (!textoResultado.equals("No results were found for your search \"" + palabraBuscar + "\"")){
            throw new Exception("El mensaje de no encontrar resultados en la busqueda no corresponde: ");
        }

    }
}
