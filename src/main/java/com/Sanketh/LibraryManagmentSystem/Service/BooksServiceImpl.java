package com.Sanketh.LibraryManagmentSystem.Service;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import com.Sanketh.LibraryManagmentSystem.Rerpository.BooksRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
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
        Optional<List<Books>> books = booksRepository.findAllBooksByAuthor(author);
        if(books.isPresent()){
            return books.get();
        }
        else {
            return null;
        }
    }

    @Override
    public List<Books> findAllBooksByPublisher(String genre){
        Optional<List<Books>> books = booksRepository.findAllBooksByPublisher(genre);
        if(books.isPresent()){
            return books.get();
        }
        else {
            return null;
        }
    }

    @Override
    public  List<Books> findAllBooksByCategory(String genre) {
        Optional<List<Books>> books = booksRepository.findAllBooksByCategory(genre);
        if(books.isPresent()){
            return books.get();
        }
        else {
            return null;
        }
    }

    @Override
    public List<Books> findAllBooksByPublished_date(LocalDate published_date) {
        Optional<List<Books>> books= booksRepository.findAllBooksPublishedDate(published_date);
        if(books.isPresent()){
            return books.get();
        }
        else {
            return  null;
        }
    }
}
