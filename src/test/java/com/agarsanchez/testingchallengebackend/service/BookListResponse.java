package com.agarsanchez.testingchallengebackend.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * Created by albertogarciasanchez on 13/6/18.
 */
public class BookListResponse {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
