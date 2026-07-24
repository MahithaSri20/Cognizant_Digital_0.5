package com.cognizant.librarymanagement;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBook() {
        bookRepository.displayBook();
        System.out.println("Book Service is working...");
    }
}