package com.Sanketh.LibraryManagmentSystem.Exceptions;

import java.io.Serial;

public class BookNotFoundException extends RuntimeException {
    @Serial
    private static  final long serialVersionUID = 1L;
    public BookNotFoundException(String message) {
        super(message);
    }
}
