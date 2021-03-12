Feature: Realizar la compra y pago de prenda
  Como usuario deseo poder realizar la compra y pago una prenda que ofrece la pagina
  Scenario: Realizar compra de prenda
    When el usuario se encuentra autenticado
    And esta dentro de la pantalla del producto a comprar
    And haber dado clic en el boton de añadir al carro
    And haber dado clic en el botón de pasar a la caja de la ventana que muestra el aplicativo
    And el usuario da clic en el boton de pasar por la caja en cada uno de los pasos hasta el paso 4
    And acepta terminos y condiciones
    And el usuario da clic en el botón de pasar por la caja para ir al paso 5
    And en el paso 5 indica que desea pagar con cuenta bancaria
    And el usuario confirma la orden
    Then el aplicativo muestra mensaje indicando que el pedido en la tienda esta completado