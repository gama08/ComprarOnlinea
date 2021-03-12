package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class Buscador extends TestPaginaPrincipal {

    private String url = "http://automationpractice.com/index.php?id_category=5&controller=category";

    @When("^el usuario se encuentra en cualquier pagina del aplicativo$")
    public void el_usuario_se_encuentra_en_cualquier_pagina_del_aplicativo() {
        buscador.cargarPaginaPrincipal(url);
    }

    @When("^el usuairo ingresa un nombre de producto a buscar$")
    public void el_usuairo_ingresa_un_nombre_de_producto_a_buscar() throws Throwable {
        buscador.ingresarPrendaBuscar();
    }

    @When("^da clic en el icono para realizar la consulta$")
    public void da_clic_en_el_icono_para_realizar_la_consulta(){
        buscador.buscarPrenda();
    }

    @Then("^el aplicativo muestra la prenda o las prensdas encontradas en pantalla$")
    public void el_aplicativo_muestra_la_prenda_o_las_prensdas_encontradas_en_pantalla() throws Throwable {
        buscador.validarPrendasEncontradas();
        url = remoteWebDriver.getCurrentUrl();
    }

    @When("^el usuario se encuentra en cualquier pantalla del aplicativo$")
    public void el_usuario_se_encuentra_en_cualquier_pantalla_del_aplicativo()  {
        buscador.cargarPaginaPrincipal(url);
    }

    @When("^el usuario ingresa un nombre del producto a buscar$")
    public void el_usuario_ingresa_un_nombre_del_producto_a_buscar() throws Throwable {
        buscador.ingresarPrendaNoExistente();
    }

    @When("^da clic en el icono para buscar la prenda$")
    public void da_clic_en_el_icono_para_buscar_la_prenda() {
        buscador.buscarPrenda();
    }

    @Then("^el aplicativo muestra mensaje No se encontraron resultados para su búsqueda$")
    public void el_aplicativo_muestra_mensaje_No_se_encontraron_resultados_para_su_búsqueda() throws Throwable {
        buscador.validarMesajePrendaNoExistente();
    }


}
