package com.example.graphqlwithspringboot.controller;

import com.example.graphqlwithspringboot.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {


    @QueryMapping
    public Book bookById(@Argument String id){

    }
}
