package com.example.application.data.entities;
import jakarta.persistence.*;
import java.time.Year;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amount;
    private String title;
    private String isbn;
    private int year;
    private String publisher;
    private boolean status;
    @Column(name = "date_added")
    private Date dateAdded;
    @Column(name = "deactivation_date")
    private Date deactivationDate;
    @Column(name = "deactivation_description")
    private String deactivationDescription;
    private String language;

    @ManyToMany(mappedBy = "books")
    private List<Genre> genres;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    @ManyToOne
    @JoinColumn(name = "deactivation_reason_id")
    private DeactivationReason deactivationReason;
}
