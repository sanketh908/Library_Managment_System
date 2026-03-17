package com.Sanketh.LibraryManagmentSystem.Service;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import com.Sanketh.LibraryManagmentSystem.Rerpository.BooksRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BooksService {
    public Books saveBooks(Books books);
    public List<Books> findAllBooks();
    public Books findBooksById(Integer id);
    public Books updateBooksById(Integer id, Books books);

    public boolean deleteBooksById(Integer id);

    public List<Books> findAllBooksByAuthor(String author);
    public List<Books> findAllBooksByPublisher(String publisher);

    public   List<Books>findAllBooksByCategory(String genre);
    public  List<Books> findAllBooksByPublished_date(LocalDate published_date);
}
