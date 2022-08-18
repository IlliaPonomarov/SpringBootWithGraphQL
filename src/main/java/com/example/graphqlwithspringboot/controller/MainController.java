package com.example.graphqlwithspringboot.controller;

import com.example.graphqlwithspringboot.model.Author;
import com.example.graphqlwithspringboot.model.Book;
import com.example.graphqlwithspringboot.services.AuthorService;
import com.example.graphqlwithspringboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {


    private final BookService bookService;
    private final AuthorService authorService;


    @Autowired
    public MainController(BookService bookService, AuthorService authorService){
        this.bookService = bookService;
        this.authorService = authorService;
    }
    @QueryMapping
    public Optional<Book> bookById(@Argument int id){
        return bookService.getBookById(id);
    }


    @QueryMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }


    @MutationMapping
    public Book addBook(@Argument String name, @Argument  Integer pageCount, @Argument Integer authorId){

        System.out.println(name);
        System.out.println(pageCount);
        System.out.println(authorId);
        Optional<Author> author = authorService.findById(authorId);

        if (!author.isPresent()) {
            System.out.println("Author with this id does not exist");
            return null;
        }

        Book book = new Book(name, pageCount, author.get());


        System.out.println(book.toString());

        return bookService.save(book);
    }



}
