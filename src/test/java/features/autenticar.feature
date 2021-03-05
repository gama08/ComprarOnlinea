Feature: Autenticar usuario
  Como usuario deseo poder iniciar sesión con mi correo electrónico
  y mi contraseña para poder realizar mis compras virtuales
  Scenario: Autenticar usuario desde la pantalla Login
    Given El usuario se encuentra en la pagina principal
    When Cuando el usuario da clic en el botón Sing in
    And en la sección de login ingresa correo electrónico y contraseña
    And el usuario da clic en el botón ingresar
    Then el sistema autentica al usuario y redirige a la pantalla mi cuenta
