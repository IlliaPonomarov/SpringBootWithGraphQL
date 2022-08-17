package com.example.graphqlwithspringboot.repository;

import com.example.graphqlwithspringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {
}
