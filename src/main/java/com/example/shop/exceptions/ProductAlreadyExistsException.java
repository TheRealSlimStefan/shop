package com.example.shop.exceptions;

public class ProductAlreadyExistsException extends RuntimeException {
    public ProductAlreadyExistsException() {
        super("Product with given name exists in database!");
    }
}
