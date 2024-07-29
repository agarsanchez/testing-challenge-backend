package com.agarsanchez.testingchallengebackend.acceptance.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class BooksStepDefinitions {

    private Response response;
    private String title;

    @Given("I am a customer that wants to buy the {string} book")
    public void iAmACustomerThatWantsToBuyABook(String title) throws Throwable {
        this.title = title;
    }

    @When("^I ask about a book$")
    public void iAskAboutABook() throws Throwable {
        response = when().get("/books?query=" + this.title);
    }

    @Then("^I will get a list with the different titles and prices$")
    public void iWillGetAListWithTheDifferentRetailersAndPrices(Map<String, Float> testData) throws Throwable {
        ValidatableResponse validatableResponse = response.then().statusCode(200);

        Set<String> titles = testData.keySet();

        int index = 0;
        for (String title : titles) {
            Float price = testData.get(title);

            validatableResponse.
                    body("books[" + index + "].price", equalTo(price)).
                    body("books[" + index + "].title", equalTo(title));

            index++;
        }

    }
}
