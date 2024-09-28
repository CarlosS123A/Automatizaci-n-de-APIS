import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import io.cucumber.java.en.*;

public class StoreOrderSteps {
    private static String orderId;
    private Response response;

    @Given("la API PetStore está disponible")
    public void apiDisponible() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @When("realizo una solicitud POST a /store/order con un body válido")
    public void crearOrden() {
        String body = "{ \"id\": 1, \"petId\": 1, \"quantity\": 1, \"shipDate\": \"2024-10-01T00:00:00Z\", \"status\": \"placed\", \"complete\": true }";
        response = RestAssured.given().header("Content-Type", "application/json")
                .body(body)
                .post("/store/order");
        orderId = response.jsonPath().getString("id");
    }

    @Then("la respuesta tiene un código de estado 200")
    public void validarCodigoEstado() {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("el cuerpo de la respuesta contiene el ID del pedido")
    public void validarCuerpoRespuesta() {
        Assert.assertNotNull(orderId);
    }

    @Given("un pedido ha sido creado con el ID {string}")
    public void unPedidoHaSidoCreado(String orderId) {
        this.orderId = orderId;
    }

    @When("realizo una solicitud GET a /store/order/{orderId}")
    public void consultarOrden() {
        response = RestAssured.given().get("/store/order/" + orderId);
    }

    @Then("el cuerpo de la respuesta contiene la información del pedido")
    public void validarCuerpoConsulta() {
        Assert.assertEquals(orderId, response.jsonPath().getString("id"));
    }
}