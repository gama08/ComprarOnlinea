package pom.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Boolean;

import java.util.List;

public class FuncionesSelenium {

    private RemoteWebDriver remoteWebDriver;

    public FuncionesSelenium (RemoteWebDriver remoteWebDriver){

        this.remoteWebDriver = remoteWebDriver;
    }

    private WebDriverWait tiempoEspera;

    public void abrirNavegador(String url){
        remoteWebDriver.get(url);
        remoteWebDriver.manage().window().maximize();
    }

    public WebElement findElement(By localizador) {
        return remoteWebDriver.findElement(localizador);
    }

    public List<WebElement> findElements(By localizador) {
        return remoteWebDriver.findElements(localizador);
    }

    public String getText(WebElement elemento) {
        return elemento.getText();
    }

    public String getText(By localizador) {
        return remoteWebDriver.findElement(localizador).getText();
    }

    public void teclear(String texto, By localizador) {
        remoteWebDriver.findElement(localizador).sendKeys(texto);
    }

    public void click(By localizador) {
        remoteWebDriver.findElement(localizador).click();
    }

    public String getTextSele(WebElement elemento) {
        return elemento.getText();
    }

    public String getTextSele(By localizador) {
        return remoteWebDriver.findElement(localizador).getText();
    }

    public void click(WebElement elemento) {
        elemento.click();
    }

    public String seleccionarListas(By listado, String campoSeleccionado) {
        Select lista = new Select(findElement(listado));
        lista.selectByVisibleText(campoSeleccionado);
        return getText(lista.getFirstSelectedOption());
    }

    public WebElement seleccionadoOpcion(By listado, String campoSeleccionado) {
        Select lista = new Select(findElement(listado));
        lista.selectByVisibleText(campoSeleccionado);
        return lista.getFirstSelectedOption();
    }

    public WebElement tiempoEmperaElementoVisible(By localizador, int segundos) {
        tiempoEspera = new WebDriverWait(remoteWebDriver, segundos);
        return tiempoEspera.until(ExpectedConditions.visibilityOfElementLocated(localizador));
    }

    public WebElement tiempoEsperaCampoListo(By localizador, int segundos) {
        tiempoEspera = new WebDriverWait(remoteWebDriver, segundos);
        return tiempoEspera.until(ExpectedConditions.elementToBeClickable(localizador));
    }

    public void tiempoEspera(int tiempo) throws Exception {
        Thread.sleep(tiempo);
    }
    public void comprarSiExisteTitulo(String condicion, String comparacion){
        Assert.assertEquals(condicion, comparacion);
    }

    public void moverCursor(By localizador){
        Actions accion = new Actions(remoteWebDriver);
        WebElement elemento = findElement(localizador);
        accion.moveToElement(elemento).perform();
    }
}

