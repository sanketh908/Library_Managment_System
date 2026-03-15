package com.Sanketh.LibraryManagmentSystem.Rerpository;

import com.Sanketh.LibraryManagmentSystem.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
