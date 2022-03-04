package desafio.tests.ping.tests;

import desafio.base.BaseTest;
import desafio.suites.AllTests;
import desafio.tests.ping.request.GetPingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GetPingTest extends BaseTest {

    GetPingRequest getPingRequest=new GetPingRequest();// instancio um objeto da minha classe request
    @Test
    @Category(AllTests.class)// aqui digo que esta classe esta vinculada a suite AllTests
    public void validaApiOnline() { // verifica se a api esta online, faz a request

        getPingRequest.pingReturnApi()// chama o meu metodo que faz requisicao
                // valido a requisicao com os metodos abaixo
                .then()
                .statusCode(201);// status esperado para o metodo get
    }
}
