Feature: This service provides a list of books with the retailers that currently provide them.

  Scenario: Returning a list of books by name
    Given I am a customer that wants to buy the "Harry Potter" book
    When I ask about a book
    Then I will get a list with the different titles and prices
      | Harry Potter | 12.01 |