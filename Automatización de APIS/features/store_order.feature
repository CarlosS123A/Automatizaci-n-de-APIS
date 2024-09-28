Feature: Gestión de pedidos en PetStore

  Background:
    Given la API PetStore está disponible

  Scenario: Creación de un pedido
    When realizo una solicitud POST a /store/order con un body válido
    Then la respuesta tiene un código de estado 200
    And el cuerpo de la respuesta contiene el ID del pedido

  Scenario: Consulta de un pedido
    Given un pedido ha sido creado con el ID <orderId>
    When realizo una solicitud GET a /store/order/<orderId>
    Then la respuesta tiene un código de estado 200
    And el cuerpo de la respuesta contiene la información del pedido