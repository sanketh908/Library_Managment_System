package com.Sanketh.LibraryManagmentSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
@Data
@Entity
@Table (name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "title", nullable = false,unique = true)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "publisher", nullable = false)
    private  String publisher;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;
    @Column(name = "published_date", nullable = false)
    private LocalDate publishedDate;
    @Column(name = "total_copies", nullable = false)
    private String totalCopies;
    @Column(name = "available_copies", nullable = false)
    private int availableCopies;

}
