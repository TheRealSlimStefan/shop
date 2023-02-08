package com.example.shop.exceptions;

public class ProductPriceInvalidException extends RuntimeException {
    public ProductPriceInvalidException(Float productPrice){
        super("Price should not be less than 0.01! Your price: " + productPrice);
    }
}
