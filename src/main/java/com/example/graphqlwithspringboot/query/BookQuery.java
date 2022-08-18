package com.example.graphqlwithspringboot.query;

import com.example.graphqlwithspringboot.model.Book;
import com.example.graphqlwithspringboot.services.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class BookQuery implements GraphQLQueryResolver {
    private final BookService bookService;


    @Autowired
    public BookQuery(BookService bookService) {
        this.bookService = bookService;
    }


     public Optional<Book> findById(int id){
        return bookService.findById(id);
     }

     public List<Book> findAll(){
        return bookService.getAllBooks();
     }
}
