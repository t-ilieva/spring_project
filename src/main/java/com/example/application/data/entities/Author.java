package com.example.application.data.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "author_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn( name = "author_id",
            referencedColumnName = "id"))
    private List<Book> books;
}
