package com.example.graphqlwithspringboot.services;

import com.example.graphqlwithspringboot.model.Book;
import com.example.graphqlwithspringboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
@Service
@Transactional(readOnly = true)
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(int id){
        return bookRepository.findById(id);
    }

    @Transactional
    public Book save(Book book){
        return bookRepository.save(book);
    }


    public Book update(Book updateBook) {

        return bookRepository.save(updateBook);
    }
}
