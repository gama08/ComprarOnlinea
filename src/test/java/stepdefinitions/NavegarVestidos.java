package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class NavegarVestidos extends TestPaginaPrincipal {
    private final String URL = "http://automationpractice.com/index.php";

    @Given("^el usuario se encuentre en pagina de inicio$")
    public void el_usuario_se_encuentre_en_pagina_de_inicio(){
        camisetas.cargarPaginaPrincipal(URL);
    }

    @When("^el usuario mueve el cursor al menú de vestidos$")
    public void el_usuario_mueve_el_cursor_al_menú_de_vestidos(){
        camisetas.navegarPaginaVestidosCasuales();
    }

    @When("^da clic en la opción vestidos casuales$")
    public void da_clic_en_la_opción_vestidos_casuales() {
        camisetas.seleccionarOpcionVestidosCasuales();
    }

    @Then("^el aplicativo muestra la pagina de vestidos casuales$")
    public void el_aplicativo_muestra_la_pagina_de_vestidos_casuales() throws Exception {
        camisetas.confirmarIngresoPantallaVestidosCasuales();
    }

}
