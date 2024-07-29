package com.agarsanchez.testingchallengebackend.repository;

import com.agarsanchez.testingchallengebackend.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InMemoryBooksRepositoryTest {


    private final InMemoryBooksRepository repository = new InMemoryBooksRepository();

    @Test
    void shouldReturnBooksThatMatchTheName() {

        List<Book> books = repository.find("Harry Potter");
        assertEquals(1, books.size());
        assertEquals("Harry Potter", books.get(0).getTitle());
    }
}