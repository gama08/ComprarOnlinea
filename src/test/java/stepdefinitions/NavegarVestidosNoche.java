package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class NavegarVestidosNoche extends TestPaginaPrincipal {

    private final String URL = "http://automationpractice.com/index.php";

    @Given("^el usuario se encuentra en pagina de inicio$")
    public void el_usuario_se_encuentra_en_pagina_de_inicio(){
        camisetas.cargarPaginaPrincipal(URL);

    }

    @When("^el usuario posiciona en el  menú de vestidos$")
    public void el_usuario_posiciona_en_el_menú_de_vestidos(){
        camisetas.navegarPaginaVestidosNoche();
    }

    @When("^da clic en la opción vestidos noche$")
    public void da_clic_en_la_opción_vestidos_noche(){
        camisetas.seleccionarOpcionVestidosNoche();
    }

    @Then("^el aplicativo muestra la pagina de vestidos noche$")
    public void el_aplicativo_muestra_la_pagina_de_vestidos_noche() throws Throwable {
        camisetas.confirmarIngresoPantallaVestidosNoche();
    }



}
