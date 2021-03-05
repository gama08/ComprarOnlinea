package pom.autenticar;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.selenium.FuncionesSelenium;

public class IniciarSesion extends FuncionesSelenium {

    private static final int TIEMPO_ESPERA = 30;

    private By btnSingIn = By.linkText("Sign in");
    private By correoElectronico = By.xpath("//*[@id=\"email\"]");
    private By contrasenia = By.id("passwd");
    private By btnIngresar = By.name("SubmitLogin");
    private By tituloMiCuenta = By.xpath("//*[@id=\"center_column\"]/h1");

    public IniciarSesion(RemoteWebDriver remoteWebDriver){

        super(remoteWebDriver);
    }

    public void cargarPaginaPrincipal(String url){
        abrirNavegador(url);
    }

    public void irPantallaAutenticacion(){
        tiempoEmperaElementoVisible(btnSingIn, TIEMPO_ESPERA);
        click(btnSingIn);
    }

    public void diligenciarDatosAutenticar(){
        tiempoEmperaElementoVisible(correoElectronico, TIEMPO_ESPERA);
        teclear("beltranramosgamalielantonio@gmail.com",correoElectronico);
        tiempoEmperaElementoVisible(contrasenia, TIEMPO_ESPERA);
        teclear("B3tr4*823", contrasenia);
    }

    public void validarCuentaUsuario(){
        tiempoEmperaElementoVisible(btnIngresar, TIEMPO_ESPERA);
        click(btnIngresar);
    }

    public void validarUsuarioPantallaMiCuenta() throws Exception{
        tiempoEmperaElementoVisible(tituloMiCuenta, TIEMPO_ESPERA);
        comprarSiExisteTitulo("MY ACCOUNT", getText(tituloMiCuenta));
        tiempoEspera(5000);
    }
}
