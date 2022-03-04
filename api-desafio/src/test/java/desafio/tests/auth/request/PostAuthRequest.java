package desafio.tests.auth.request;


import desafio.base.BaseTest;
import desafio.tests.auth.payloads.AuthPayloads;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// nesta classe pego o corpo/body da minha requisicao
public class PostAuthRequest extends BaseTest {

    AuthPayloads authPayloads= new AuthPayloads();

    public Response tokenReturn() {
        return given()
                .headers("Content-Type", "application/json")
                .when()
                .body(authPayloads.jsonAuthLogin().toString())
                .post("auth");
        // retorna token no formato  "token": "abc123"
    }
    public String getToken(){
        return "token="+this.tokenReturn()
                .then()
                .statusCode(200)
                .extract()
                .path("token");// este metodo extrai a informacao contida no token
        // por exemplo o "abc123" de "token"

    }


}
