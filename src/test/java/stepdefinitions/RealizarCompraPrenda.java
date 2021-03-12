package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class RealizarCompraPrenda extends TestPaginaPrincipal {

    private String url = "http://automationpractice.com/index.php";

    @When("^el usuario se encuentra autenticado$")
    public void el_usuario_se_encuentra_autenticado() throws Throwable {
        iniciarSesion.cargarPaginaPrincipal(url);
        iniciarSesion.irPantallaAutenticacion();
        iniciarSesion.diligenciarDatosAutenticar();
        iniciarSesion.validarCuentaUsuario();
        iniciarSesion.validarUsuarioPantallaMiCuenta();
    }

    @When("^esta dentro de la pantalla del producto a comprar$")
    public void esta_dentro_de_la_pantalla_del_producto_a_comprar() {
        compra.irPaginaPrincipal();
    }

    @When("^haber dado clic en el boton de añadir al carro$")
    public void haber_dado_clic_en_el_boton_de_añadir_al_carro() {
        compra.añadirProductoCarrito();
    }

    @When("^haber dado clic en el botón de pasar a la caja de la ventana que muestra el aplicativo$")
    public void haber_dado_clic_en_el_botón_de_pasar_a_la_caja_de_la_ventana_que_muestra_el_aplicativo() {
        compra.pasarACaja();
    }

    @When("^el usuario da clic en el boton de pasar por la caja en cada uno de los pasos hasta el paso (\\d+)$")
    public void el_usuario_da_clic_en_el_boton_de_pasar_por_la_caja_en_cada_uno_de_los_pasos_hasta_el_paso(int arg1){
        compra.realizarPagosCompra();
    }

    @When("^acepta terminos y condiciones$")
    public void acepta_terminos_y_condiciones() {
        compra.aceptarTyC();
    }

    @When("^el usuario da clic en el botón de pasar por la caja para ir al paso (\\d+)$")
    public void el_usuario_da_clic_en_el_botón_de_pasar_por_la_caja_para_ir_al_paso(int arg1){
        compra.continuarPago();
    }

    @When("^en el paso (\\d+) indica que desea pagar con cuenta bancaria$")
    public void en_el_paso_indica_que_desea_pagar_con_cuenta_bancaria(int arg1) {
        compra.seleccionarFormaPagoBanco();
    }

    @When("^el usuario confirma la orden$")
    public void el_usuario_confirma_la_orden() {
        compra.confirmarPago();
    }

    @Then("^el aplicativo muestra mensaje indicando que el pedido en la tienda esta completado$")
    public void el_aplicativo_muestra_mensaje_indicando_que_el_pedido_en_la_tienda_esta_completado() {
        compra.mensajeConfirmacion();
    }
}
