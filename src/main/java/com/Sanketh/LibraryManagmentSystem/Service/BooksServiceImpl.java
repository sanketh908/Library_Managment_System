package com.Sanketh.LibraryManagmentSystem.Service;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import com.Sanketh.LibraryManagmentSystem.Rerpository.BooksRepository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public class BooksServiceImpl implements BooksService {
    private final  BooksRepository booksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Books saveBooks(Books books) {
        return  booksRepository.save(books);
    }

    @Override
    public List<Books> findAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Books findBooksById(Integer id) {
        Optional<Books> books=  booksRepository.findById(id);
        if(books.isPresent()){
            return books.get();
        }
        else {
            return null;
        }
    }

    @Override
    public Books updateBooksById(Integer id, Books books) {
        Optional<Books> books1= booksRepository.findById(id);
        if(books1.isPresent()){
          return   booksRepository.save(books);
        }
        else {
            return null;
        }


    }

    @Override
    public boolean deleteBooksById(Integer id) {
        Optional<Books> books= booksRepository.findById(id);
        if(books.isPresent()){
            booksRepository.deleteById(id);
            return true;
        }
        return false;

    }

    @Override
    public List<Books> findAllBooksByAuthor(String author) {
        return List.of();
    }

    @Override
    public List<Books> findAllBooksByPublisher(String genre) {
        return List.of();
    }

    @Override
    public List<Books> findAllBooksByCategory(String genre) {
        return List.of();
    }

    @Override
    public List<Books> findAllBooksByPublished_date(String genre, String category) {
        return List.of();
    }
}
