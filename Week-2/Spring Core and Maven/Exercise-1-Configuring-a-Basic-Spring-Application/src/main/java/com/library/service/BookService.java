package com.library.service;

import com.library.repository.BookRepository;

/**
 * Service class that uses the repository.
 */
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService is active.");
        bookRepository.displayRepository();
    }
}
