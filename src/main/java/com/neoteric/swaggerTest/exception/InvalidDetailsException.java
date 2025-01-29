package com.neoteric.swaggerTest.exception;

public class InvalidDetailsException  extends RuntimeException
{
    private final String message;

    public InvalidDetailsException() {
        this.message = "Invalid details provided";
    }

    public InvalidDetailsException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
