package com.Sanketh.LibraryManagmentSystem.Exceptions;


import com.Sanketh.LibraryManagmentSystem.Entity.ResponseStructure;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BooksExceptionHandler extends RuntimeException {
    public ResponseEntity<ResponseStructure<String>> handleBookNotFoundException(BookNotFoundException e) {
        ResponseStructure<String> responseStructure = new ResponseStructure<>();
        responseStructure.setMessage(e.getMessage());
        responseStructure.setStatusCode(404);
        responseStructure.setData("Book not found");
        return ResponseEntity.status(404).body(responseStructure);
    }
}
