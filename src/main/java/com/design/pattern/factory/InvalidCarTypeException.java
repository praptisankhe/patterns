package com.design.pattern.factory;

public class InvalidCarTypeException extends RuntimeException {

    public InvalidCarTypeException(String message)
    {
        super(message);
    }
}
