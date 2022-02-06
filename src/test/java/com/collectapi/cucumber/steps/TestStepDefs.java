package com.collectapi.cucumber.steps;

import com.collectapi.teststeps.GetCasesSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;

public class TestStepDefs {
    ValidatableResponse response;
    @Steps
    GetCasesSteps getCasesSteps;

    @When("^I send the request to get the total number of covid cases for country \"([^\"]*)\"$")
    public void iSendTheRequestToGetTheTotalNumberOfCovidCasesForCountry(String country)  {
       response= getCasesSteps.getCountryCases(country);

    }

    @Then("^I should verify the status code 200, request successful$")
    public void iShouldVerifyTheStatusCodeRequestSuccessful() {
     response.statusCode(200).log().ifValidationFails();
    }

    @And("^I should extract the total number of corona cases for UK$")
    public void iShouldExtractTheTotalNumberOfCoronaCasesForUK() {
      ArrayList totalCasesList=  response.extract().path("result.totalCases");
      Object totalCases= totalCasesList.get(0);
        System.out.println("Total number of cases for UK: "+totalCases);
    }
}
