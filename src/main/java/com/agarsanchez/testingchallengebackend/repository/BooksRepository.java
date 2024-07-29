package com.agarsanchez.testingchallengebackend.repository;

import com.agarsanchez.testingchallengebackend.model.Book;

import java.util.List;

public interface BooksRepository {

    List<Book> find(String query);
}
