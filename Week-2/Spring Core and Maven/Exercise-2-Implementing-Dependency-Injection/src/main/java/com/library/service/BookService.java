package com.library.service;

import com.library.repository.BookRepository;

/**
 * Service class using setter injection.
 */
public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService is active.");
        bookRepository.displayRepository();
    }
}
