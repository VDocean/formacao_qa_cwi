package desafio.tests.auth.payloads;

import org.json.JSONObject;

public class AuthPayloads {
    public JSONObject jsonAuthLogin(){
        JSONObject payloadLogin = new JSONObject();// instancio este objeto pois o body precisa das informacoes que passarei nele
        payloadLogin.put("username","admin");
        payloadLogin.put("password","password123");

        return payloadLogin;
    }

}
