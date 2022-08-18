package com.example.graphqlwithspringboot.mutations;

import com.example.graphqlwithspringboot.model.Book;
import com.example.graphqlwithspringboot.services.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutations implements GraphQLMutationResolver {

    private final BookService bookService;

    @Autowired
    public BookMutations(BookService bookService) {
        this.bookService = bookService;
    }


    public Book save(Book book){
        return bookService.save(book);
    }

    public Book update(Book book){
        return bookService.update(book);
    }
}
