package com.Sanketh.LibraryManagmentSystem.Service;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import com.Sanketh.LibraryManagmentSystem.Rerpository.BooksRepository;

import java.util.List;

public interface BooksService {
    public List<Books> findAllBooks();
    public Books findBooksById(Integer id);
    public Books updateBooksById(Integer id, Books books);

    public  void deleteBooksById(Integer id);

    public List<Books> findAllBooksByAuthor(String author);
        public List<Books> findAllBooksByGenre(String genre);
}
