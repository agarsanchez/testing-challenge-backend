package com.agarsanchez.testingchallengebackend.acceptance;

import com.agarsanchez.testingchallengebackend.service.BookListResponse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class BooksStepDefinitions extends AcceptanceCriteriaTestConfig {

    @Autowired
    private TestRestTemplate client;

    private BookListResponse response;

    @Given("^I am a customer that wants to buy a book$")
    public void iAmACustomerThatWantsToBuyABook() throws Throwable {
    }

    @When("^I ask about a book$")
    public void iAskAboutABook() throws Throwable {
        ResponseEntity<BookListResponse> entity = client.getForEntity("/books/Harry Potter", BookListResponse.class);

        assertEquals(HttpStatus.OK, entity.getStatusCode());

        response = entity.getBody();
    }

    @Then("^I will get a list with the different retailers and prices$")
    public void iWillGetAListWithTheDifferentRetailersAndPrices() throws Throwable {
        assertThat(12.3, is(equals(response.getBooks().get(0).getPrice())));
    }
}
