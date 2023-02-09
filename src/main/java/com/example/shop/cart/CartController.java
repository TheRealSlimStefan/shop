package com.example.shop.cart;

import com.example.shop.exceptions.ErrorResponse;
import com.example.shop.product.ProductCreateDTO;
import com.example.shop.product.ProductEditDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/{cartId}")
    public ResponseEntity<Cart> getCart(@PathVariable("cartId") Long cartId){
        Cart cart = cartService.getCart(cartId);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @GetMapping("/carts")
    public ResponseEntity<List<Cart>> getCarts(){
        List<Cart> listOfCarts = cartService.getCarts();
        return new ResponseEntity<>(listOfCarts, HttpStatus.OK);
    }

    @PostMapping("/cart/product/{productId}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable("productId") Long productId){
        Cart cart = cartService.addProductToCart(productId);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PutMapping("/cart/{cartId}/product/{productId}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId){
        Cart cart = cartService.addProductToCart(cartId, productId);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PutMapping("/cart/{cartId}/product/{productId}/quantity/{quantity}")
    public ResponseEntity<Cart> changeProductQuantityInCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId, @PathVariable("quantity") Integer quantity){
        Cart cart = cartService.changeProductQuantityInCart(cartId, productId, quantity);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @DeleteMapping("/cart/{cartId}/product/{productId}")
    public ResponseEntity<Cart> deleteProductFromCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId){
        Cart cart = cartService.deleteProductFromCart(cartId, productId);
        return new ResponseEntity<>(cart, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/cart/{cartId}")
    public ResponseEntity<Void> deleteCart(@PathVariable("cartId") Long cartId){
        cartService.deleteCart(cartId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
