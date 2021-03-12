
  Feature: Buscar prenda
    Como usuario deseo poder buscar cualquier prenda y que el aplicativo me arroje resultado
    al no arrojar resultados muestre mensaje

@buscadorPrendaExistente
  Scenario: Buscar prenda existente
    When el usuario se encuentra en cualquier pagina del aplicativo
    And el usuairo ingresa un nombre de producto a buscar
    And da clic en el icono para realizar la consulta
    Then el aplicativo muestra la prenda o las prensdas encontradas en pantalla
@buscadorPrendaNoExistente
  Scenario: Buscar prenda no existente
    When el usuario se encuentra en cualquier pantalla del aplicativo
    And el usuario ingresa un nombre del producto a buscar
    And da clic en el icono para buscar la prenda
    Then el aplicativo muestra mensaje No se encontraron resultados para su búsqueda
