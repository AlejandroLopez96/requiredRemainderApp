package com.api.requiredremainder.utils;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Getter;

public class ApiErrorHandler {

    @Getter
    private HttpStatus status;
    @Getter
    private String message;
    @Getter
    private List<String> errors;

    public ApiErrorHandler(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiErrorHandler(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }
}