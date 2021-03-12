package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class NavegarBlusas extends TestPaginaPrincipal {

    private final String URL = "http://automationpractice.com/index.php";

    @Given("^el usuario se encuentre en la pagina principal$")
    public void mostrarPantallaPrincipal(){
        camisetas.cargarPaginaPrincipal(URL);

    }

    @When("^el usuario mueve el cursor del mause al menú de mujer$")
    public void ingresarMenuBlusas(){
        camisetas.navegarPaginaBlusas();
    }

    @When("^da clic en la opción de blusas$")
    public void confirmarIngresoPantallaBlusas(){
        camisetas.seleccionarOpcionBlusas();

    }

    @Then("^el aplicativo muestra la pagina de blusas$")
    public void el_aplicativo_muestra_la_pagina_de_blusas() throws Exception {
        camisetas.confirmarIngresoPantallaBlusas();
    }


}
