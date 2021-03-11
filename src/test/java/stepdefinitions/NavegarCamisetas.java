package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

public class NavegarCamisetas extends TestPaginaPrincipal {
    private final String URL = "http://automationpractice.com/index.php";

    @Given("^el usuario se encuentre en la pantalla principal$")
    public void cargarPaginaPrincipal()  {
        camisetas.cargarPaginaPrincipal(URL);
    }

    @When("^el usuario da clic en el menú de camisetas$")
    public void ingresarMenuCamisetas()  {
        camisetas.navegarPaginaCamisetas();

    }

    @Then("^el aplicativo muestra la pagina de camisetas$")
    public void confirmarIngresoPantallaCamisetas() throws Exception {
        camisetas.confirmarIngresoMenuCamisetas();
    }

}
