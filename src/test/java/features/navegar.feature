Feature: Navegar por los menus y opciones
  Como usuario deseo poder navegar por los menus y submenus del aplicativo
@camisas
  Scenario: Ingresar al menú de camisetas
    Given el usuario se encuentre en la pantalla principal
    When el usuario da clic en el menú de camisetas
    Then el aplicativo muestra la pagina de camisetas


@blusas
  Scenario: Ingresar al menú de blusas
    Given el usuario se encuentre en la pagina principal
    When el usuario mueve el cursor del mause al menú de mujer
    And  da clic en la opción de blusas
    Then el aplicativo muestra la pagina de blusas

@vestidoCasual
  Scenario: Ingresar a la pantalla vestido Casual
    Given el usuario se encuentre en pagina de inicio
    When el usuario mueve el cursor al menú de vestidos
    And da clic en la opción vestidos casuales
    Then el aplicativo muestra la pagina de vestidos casuales

  @vestidoNoche
  Scenario: Ingresar a la pantalla vestido Noche
    Given el usuario se encuentra en pagina de inicio
    When el usuario posiciona en el  menú de vestidos
    And da clic en la opción vestidos noche
    Then el aplicativo muestra la pagina de vestidos noche

  @vestidoVerano
  Scenario: Ingresar a la pantalla vestido verano
    Given el usuario se encuentra en pagina de home
    When el usuario esta en el  menú de vestidos
    And da clic en la opción vestidos verano
    Then el aplicativo muestra la pagina de vestidos verano