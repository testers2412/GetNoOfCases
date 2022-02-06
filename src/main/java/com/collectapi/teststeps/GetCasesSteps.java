package com.collectapi.teststeps;

import com.collectapi.constants.EndPoints;
import com.collectapi.params.Headers;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import javax.xml.ws.Endpoint;

public class GetCasesSteps {
    @Step()
    public ValidatableResponse getCountryCases(String county){
        return SerenityRest.rest().given().log().ifValidationFails()
                .headers(Headers.getHeaders())
                .queryParam("country", county)
                .when()
                .get(EndPoints.GET_COUNTRY_DATA)
                .then();
    }
}
