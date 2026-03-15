package com.Sanketh.LibraryManagmentSystem.Controller;

import com.Sanketh.LibraryManagmentSystem.Rerpository.BooksRepository;

public class BooksController {
    private final BooksRepository booksRepository;

    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

}
