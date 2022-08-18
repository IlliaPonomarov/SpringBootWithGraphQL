package com.example.graphqlwithspringboot.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.*;

@Entity
@Table(name = "Book")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "pagecount")
    @Positive
    private int pageCount;


    @ManyToOne
    @JoinColumn(name = "author_id")
    @NotNull
    private Author author;

    public Book(String name, int pageCount, Author author) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }
}
