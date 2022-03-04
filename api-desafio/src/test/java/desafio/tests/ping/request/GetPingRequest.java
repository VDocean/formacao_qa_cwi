package desafio.tests.ping.request;

import desafio.base.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPingRequest extends BaseTest {
    public Response pingReturnApi(){
        return given()
                .header("Content-Type","application/json")
                .when()
                .get("ping");

    }
}
