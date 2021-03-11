Feature: Navegar por los menus y opciones
  Como usuario deseo poder navegar por los menus y submenus del aplicativo
@camisas
  Scenario: Ingresar al menú de camisetas
    Given el usuario se encuentre en la pantalla principal
    When el usuario da clic en el menú de camisetas
    Then el aplicativo muestra la pagina de camisetas


@blusas
  Scenario: Ingresar al menú de blusas
    Given el usuario se encuentre en la pantalla principal
    When el usuario mueve el cursor del mause al menú de mujer
    And  da clic en la opción de blusas
    Then el aplicativo muestra la pagina de blusas