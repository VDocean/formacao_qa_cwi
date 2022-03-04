package desafio.tests.booking.tests;

import desafio.base.BaseTest;
import desafio.suites.AllTests;
import desafio.suites.ContractTest;
import desafio.tests.booking.request.GetBookingRequest;
import desafio.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {

    GetBookingRequest getBookingRequest= new GetBookingRequest();// crio uma instancia da minha requisicao
    @Test
    @Category({AllTests.class})

    public void validaListagemDeIdsDasReservas(){

        getBookingRequest.bookingRetunrIds()
                // a partir começa as validacoes do retorno da chamada do metodo acima
                .then()
                .statusCode(200)
                .body("size()",greaterThan(0));// valida o retorno do corpo, numero de ids deste metodo deve ser maior
        // que zero, ja que ha reservas cadastradas,


    }
    @Test
    @Category({AllTests.class, ContractTest.class})
    public void validaSchemadaListagemDeReserva(){
        getBookingRequest.bookingRetunrIds()
                // a partir começa as validacoes do retorno da chamada do metodo acima
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking","Bookings"))));
    }

    @Test
    @Category({AllTests.class})
    public void validaOneId(){
        getBookingRequest.bookingReturnOneId()
                // a partir começa as validacoes do retorno da chamada do metodo acima
                .then()
                .statusCode(200)
                .body("size()",greaterThan(0));// valida o retorno do corpo, numero de ids deste metodo deve ser maior
        // que zero, ja que ha reservas cadastradas,

    }
    @Test
    @Category({AllTests.class,ContractTest.class})
    public void validaSchemaOneId(){
        getBookingRequest.bookingReturnOneId()
                // a partir começa as validacoes do retorno da chamada do metodo acima
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking","ReservaEspecifica"))));
    }


}
