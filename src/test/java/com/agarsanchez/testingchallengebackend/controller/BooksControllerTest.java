package com.agarsanchez.testingchallengebackend.controller;

import com.agarsanchez.testingchallengebackend.model.Book;
import com.agarsanchez.testingchallengebackend.model.BookListResponse;
import com.agarsanchez.testingchallengebackend.repository.BooksRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BooksControllerTest {

    @Mock
    public BooksRepository booksRepository;

    @InjectMocks
    private BooksController booksController;

    @BeforeEach
    void setUp() {
        List<Book> books = List.of(new Book(25.01D, "Some Book"));
        when(booksRepository.find(eq("Some Book"))).thenReturn(books);
    }

    @Test
    void shouldReturnBooks() {
        ResponseEntity<BookListResponse> response = booksController.getBooks("Some Book");
        List<Book> books = response.getBody().getBooks();

        assertEquals(1, books.size());
        assertEquals(25.01D, books.get(0).getPrice());
    }
}