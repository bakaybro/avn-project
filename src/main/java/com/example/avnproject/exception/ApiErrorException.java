package com.example.avnproject.exception;

public class ApiErrorException extends RuntimeException {
    public ApiErrorException(String message) {
        super(message);
    }

    public ApiErrorException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
