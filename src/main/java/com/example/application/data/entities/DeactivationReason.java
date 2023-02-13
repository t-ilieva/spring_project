package com.example.application.data.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "deactivation_reason")
public class DeactivationReason {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "deactivationReason")
    private List<Book> books;
}
