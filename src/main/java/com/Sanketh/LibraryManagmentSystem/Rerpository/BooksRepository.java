package com.Sanketh.LibraryManagmentSystem.Rerpository;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BooksRepository extends JpaRepository<Books, Integer> {
  Optional<Books> findAllBooksByAuthor(String author);
    Optional<Books> findAllBooksByPublisher(String publisher);
}
