package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class NavegarVestidosVerano extends TestPaginaPrincipal {
    private final String URL = "http://automationpractice.com/index.php";

    @Given("^el usuario se encuentra en pagina de home$")
    public void el_usuario_se_encuentra_en_pagina_de_home()  {
        camisetas.cargarPaginaPrincipal(URL);
    }

    @When("^el usuario esta en el  menú de vestidos$")
    public void el_usuario_esta_en_el_menú_de_vestidos() {
        camisetas.navegarPaginaVestidosVerano();
    }

    @When("^da clic en la opción vestidos verano$")
    public void da_clic_en_la_opción_vestidos_verano() {
        camisetas.seleccionarOpcionVestidosVerano();
    }

    @Then("^el aplicativo muestra la pagina de vestidos verano$")
    public void el_aplicativo_muestra_la_pagina_de_vestidos_verano() throws Throwable {
        camisetas.confirmarIngresoPantallaVestidosVerano();
    }


}
