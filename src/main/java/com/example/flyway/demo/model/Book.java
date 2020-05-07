package com.example.flyway.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book extends PrintedMatter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Book(String name) {
        this.name = name;
    }
}
