package desafio.tests.booking.payloads;

import org.json.JSONObject;

public class BookingPayloads {
    public static JSONObject payloadValidBooking() {
        JSONObject payload = new JSONObject(); // instancio um objeto para o body
        JSONObject bookingDates = new JSONObject();// instancio o objeto dentro do body com as datas

        bookingDates.put("checkin", "2013-02-23");
        bookingDates.put("checkout", "2014-10-23");

        payload.put("firstname", "Sally");
        payload.put("lastname", "Brown");
        payload.put("totalprice", 111);
        payload.put("depositpaid", true);
        payload.put("bookingdates", bookingDates);
        payload.put("additionalneeds", "Breakfast");


        return payload;


    }
}