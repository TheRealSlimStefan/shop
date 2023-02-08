package com.example.shop.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long productId){
        super("Product with id " + productId + " does not exist!");
    }
}
