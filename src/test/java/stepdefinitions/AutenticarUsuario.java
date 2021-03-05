package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.testBase.TestPaginaPrincipal;

import java.net.URL;

public class AutenticarUsuario extends TestPaginaPrincipal {

    private final String URL = "http://automationpractice.com/index.php";

    @Given("^El usuario se encuentra en la pagina principal$")
    public void el_usuario_se_encuentra_en_la_pagina_principal() throws Throwable {
        iniciarSesion.cargarPaginaPrincipal(URL);
    }

    @When("^Cuando el usuario da clic en el botón Sing in$")
    public void cuando_el_usuario_da_clic_en_el_botón_Sing_in() throws Throwable {
        iniciarSesion.irPantallaAutenticacion();
    }

    @When("^en la sección de login ingresa correo electrónico y contraseña$")
    public void en_la_sección_de_login_ingresa_correo_electrónico_y_contraseña() throws Throwable {
        iniciarSesion.diligenciarDatosAutenticar();
    }

    @When("^el usuario da clic en el botón ingresar$")
    public void el_usuario_da_clic_en_el_botón_ingresar() throws Throwable {
        iniciarSesion.validarCuentaUsuario();
    }

    @Then("^el sistema autentica al usuario y redirige a la pantalla mi cuenta$")
    public void el_sistema_autentica_al_usuario_y_redirige_a_la_pantalla_mi_cuenta() throws Throwable {
        iniciarSesion.validarUsuarioPantallaMiCuenta();
    }


}
