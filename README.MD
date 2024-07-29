# Acceptance criteria:

### Scenario: Returning a list of books by name
```gherkin
Given I am a customer that wants to buy the book
When I ask about a book by title
Then I will get a list with the different prices and titles
```

### Scenario: Returning a list of books by partial name
```gherkin
Given I am a customer that wants to buy the book
When I ask about a book by partial title
Then I will get a list with the different prices and titles
```

### Scenario: Persisting a book
```gherkin
Given I am an agent that wants to store a book
And I send the book information
Then I will be able to retrieve the book
```