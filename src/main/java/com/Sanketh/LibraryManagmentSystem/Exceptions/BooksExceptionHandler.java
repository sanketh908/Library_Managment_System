package com.Sanketh.LibraryManagmentSystem.Exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BooksExceptionHandler extends RuntimeException {
    public BooksExceptionHandler(String message) {
        super(message);
    }
}
