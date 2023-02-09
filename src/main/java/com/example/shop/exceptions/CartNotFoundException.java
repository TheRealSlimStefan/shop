package com.example.shop.exceptions;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(Long cartId){
        super("Cart with id " + cartId + " does not exist!");
    }
}
