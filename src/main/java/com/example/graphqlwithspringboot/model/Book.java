package com.example.graphqlwithspringboot.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

import javax.persistence.*;
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
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "pagecount")
    private int pageCount;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;




}
