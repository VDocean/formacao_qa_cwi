package desafio.base;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseTest {
    @BeforeClass // toda vez que rodar meus testes a URI base sera chamada antes deles
    public static void setup() {
        RestAssured.baseURI = "https://treinamento-api.herokuapp.com/";
    }
}
