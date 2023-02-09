package com.example.shop.exceptions;

public class CartDoesNotHaveProductException extends RuntimeException {
    public CartDoesNotHaveProductException(Long cartId, Long productId){
        super("Cart with id: " + cartId + " does not have product with id: " + productId);
    }
}
