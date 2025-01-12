package com.sofkau.questions;

import com.sofkau.models.ResponseRegister;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReturnRegisterSuccessfulJsonResponse implements Question<ResponseRegister> {
    @Override
    public ResponseRegister answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseRegister.class);
    }

    public static ReturnRegisterSuccessfulJsonResponse returnRegisterSuccessfulJsonResponse(){
        return new ReturnRegisterSuccessfulJsonResponse();
    }
}
