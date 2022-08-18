package com.example.graphqlwithspringboot.util.exceptions;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BookNotExistException extends RuntimeException implements GraphQLError {

    private String invalidValue;

    public BookNotExistException(String message, String invalidValue){
        super(message);
        this.invalidValue = invalidValue;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("invalidValue", invalidValue);
    }
}
