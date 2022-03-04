package desafio.tests.auth.tests;

import desafio.base.BaseTest;
import desafio.suites.AllTests;
import desafio.tests.auth.request.PostAuthRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.notNullValue;

public class PostAuthTest extends BaseTest {
    PostAuthRequest postAuthRequest=new PostAuthRequest();

    @Test
    @Category(AllTests.class)
    public void validaRetornoDeTokenParaUsuario(){
        postAuthRequest.tokenReturn()
                .then()
                .statusCode(200)
                .body("token",notNullValue());// verifica se o token passa nao eh nulo
    }
}
