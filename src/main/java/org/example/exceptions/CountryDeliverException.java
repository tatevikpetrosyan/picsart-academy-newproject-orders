package org.example.exceptions;

public class CountryDeliverException extends RuntimeException {
    private String message;
    public CountryDeliverException(String message) {
        this.message = message;
    }
}
