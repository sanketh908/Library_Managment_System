package com.Sanketh.LibraryManagmentSystem.Rerpository;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BooksRepository extends JpaRepository<Books, Integer> {
  Optional<List<Books>> findAllBooksByAuthor(String author);
  Optional<List<Books>> findAllBooksPublishedDate(LocalDate publishedDate);
  Optional<List<Books>> findAllBooksByCategory(String genre);

  Optional<List<Books>> findAllBooksByPublisher(String genre);
}
