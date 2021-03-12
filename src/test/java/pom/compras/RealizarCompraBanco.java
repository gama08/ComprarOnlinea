package pom.compras;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.selenium.FuncionesSelenium;

public class RealizarCompraBanco extends FuncionesSelenium {

    private final int TIEMPO_ESPERA = 30;

    By logoApp = By.xpath("//*[@id=\"header_logo\"]/a/img");
    By producto = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
    By pantallaProducto = By.className("pb-center-column");
    By btnProductoMas = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span");
    By btnAñadirCarrito = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By btnPasarCaja = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    By resumenCompra = By.className("step_current");
    By btnContinuarCompra = By.linkText("Proceed to checkout");
    By btnAnadirDireccion = By.linkText("Add a new address");
    By btnContinuarCompraP3 = By.name("processAddress");
    By checkTyC = By.className("checker");
    By btnContinuarCompraP4 = By.name("processCarrier");
    By selecPagarBanco = By.className("bankwire");
    By btnConfirmarPago = By.xpath("//*[@id=\"cart_navigation\"]/button");
    By confirmarPago = By.className("cheque-indent");


    public RealizarCompraBanco(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
    public void irPaginaPrincipal(){
        tiempoEmperaElementoVisible(logoApp, TIEMPO_ESPERA);
        click(logoApp);
        tiempoEmperaElementoVisible(producto, TIEMPO_ESPERA);
        moverCursor(producto);
        click(btnProductoMas);
        tiempoEmperaElementoVisible(pantallaProducto, TIEMPO_ESPERA);

    }

    public void añadirProductoCarrito(){
        tiempoEmperaElementoVisible(btnAñadirCarrito, TIEMPO_ESPERA);
        click(btnAñadirCarrito);
    }

    public void pasarACaja(){
        tiempoEmperaElementoVisible(btnPasarCaja,TIEMPO_ESPERA);
        click(btnPasarCaja);
    }
    public void realizarPagosCompra(){
        tiempoEmperaElementoVisible(btnContinuarCompra, TIEMPO_ESPERA);
        moverCursor(btnContinuarCompra);
        click(btnContinuarCompra);
        tiempoEmperaElementoVisible(btnAnadirDireccion, TIEMPO_ESPERA);
        moverCursor(btnContinuarCompraP3);
        click(btnContinuarCompraP3);


    }

    public void aceptarTyC(){
        tiempoEmperaElementoVisible(checkTyC,TIEMPO_ESPERA);
        click(checkTyC);

    }
    public void continuarPago(){
        tiempoEmperaElementoVisible(btnContinuarCompraP4, TIEMPO_ESPERA);
        click(btnContinuarCompraP4);

    }

    public void seleccionarFormaPagoBanco(){
        tiempoEmperaElementoVisible(selecPagarBanco, TIEMPO_ESPERA);
        click(selecPagarBanco);

    }
    public void confirmarPago(){
        tiempoEmperaElementoVisible(btnConfirmarPago, TIEMPO_ESPERA);
        click(btnConfirmarPago);

    }
    public void mensajeConfirmacion(){
        tiempoEmperaElementoVisible(confirmarPago, TIEMPO_ESPERA);
        click(confirmarPago);
    }
}
