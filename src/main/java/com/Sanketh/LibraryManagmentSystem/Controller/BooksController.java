package com.Sanketh.LibraryManagmentSystem.Controller;

import com.Sanketh.LibraryManagmentSystem.Service.BooksService;
import org.springframework.stereotype.Controller;

@Controller
public class BooksController {
   private final BooksService booksService;


    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }
}
