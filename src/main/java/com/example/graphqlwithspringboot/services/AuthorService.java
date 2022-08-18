package com.example.graphqlwithspringboot.services;

import com.example.graphqlwithspringboot.model.Author;
import com.example.graphqlwithspringboot.model.Book;
import com.example.graphqlwithspringboot.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class AuthorService {

    private final AuthorRepository authorRepository;


    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public void save(Author author){
        authorRepository.save(author);
    }

    public Optional<Author> findById(int id){
        return authorRepository.findById(id);
    }

    public Optional<Author> findByLastName(String lastName){
        Optional<Author> author = authorRepository.findByLastName(lastName);

        return Optional.ofNullable(author.orElse(null));
    }


}
