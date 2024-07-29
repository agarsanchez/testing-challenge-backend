package com.agarsanchez.testingchallengebackend.controller;

import com.agarsanchez.testingchallengebackend.model.Book;
import com.agarsanchez.testingchallengebackend.model.BookListResponse;
import com.agarsanchez.testingchallengebackend.repository.BooksRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    private final BooksRepository booksRepository;

    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping("/books")
    public ResponseEntity<BookListResponse> getBooks(String query) {
        List<Book> books = booksRepository.find(query);

        return ResponseEntity.ok(new BookListResponse(books));
    }
}
