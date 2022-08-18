package com.example.graphqlwithspringboot.repository;

import com.example.graphqlwithspringboot.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Optional<Author> findByLastName(String lastName);
}
