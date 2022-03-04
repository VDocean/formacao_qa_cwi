package desafio.tests.booking.request;

import desafio.base.BaseTest;
import desafio.tests.booking.payloads.BookingPayloads;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingRequest extends BaseTest {
    public Response bookingRetunrIds(){
        return given() // esse metodo nao tem header
                .when()
                .get("booking");// metodo usado para fazer a requisicao

    }
    public Response bookingReturnOneId(){
        BookingPayloads bookingPayloads=new BookingPayloads();
        return given()
                .header("Accept","application/json")
                .when()
                .body(bookingPayloads.payloadValidBooking().toString())
                .get("booking/784");


    }
}



