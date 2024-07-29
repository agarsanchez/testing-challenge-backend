package com.agarsanchez.testingchallengebackend.repository;

import com.agarsanchez.testingchallengebackend.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryBooksRepository implements BooksRepository {
    private final List<Book> books = List.of(new Book(12.01D, "Harry Potter"));

    public List<Book> find(String query) {
        return books.stream().filter(book -> book.getTitle().equals(query)).toList();
    }
}
