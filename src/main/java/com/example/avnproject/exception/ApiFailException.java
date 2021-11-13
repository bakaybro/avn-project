package com.example.avnproject.exception;

public class ApiFailException extends RuntimeException {

    public ApiFailException(String message) {
        super(message);
    }

    public ApiFailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
