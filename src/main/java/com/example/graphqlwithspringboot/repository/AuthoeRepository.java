package com.example.graphqlwithspringboot.repository;

import com.example.graphqlwithspringboot.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthoeRepository extends JpaRepository<Author, Integer> {
}
