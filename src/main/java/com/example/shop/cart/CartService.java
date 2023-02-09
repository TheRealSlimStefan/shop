package com.example.shop.cart;

import com.example.shop.exceptions.CartDoesNotHaveProductException;
import com.example.shop.exceptions.CartNotFoundException;
import com.example.shop.exceptions.ProductNotFoundException;
import com.example.shop.product.Product;
import com.example.shop.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final ProductRepository productRepository;
    private final CartRepository cartRepository;

    @Autowired
    public CartService(ProductRepository productRepository, CartRepository cartRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
    }

    public Cart getCart(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException(cartId));
        return cart;
    }

    public List<Cart> getCarts() { return cartRepository.findAll();}

    public Cart addProductToCart(Long productId) {
        Cart cart = new Cart();
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));

        cart.getProducts().add(product);
        cart.getQuantities().put(productId, 1);
        cart.countTotalPrice();

        cartRepository.save(cart);

        return cart;
    }

    public Cart addProductToCart(Long cartId, Long productId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException(cartId));
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));

        if(cart.getProducts().indexOf(product) == -1){
            cart.getProducts().add(product);
            cart.getQuantities().put(productId, 1);
            cart.countTotalPrice();
            cartRepository.save(cart);
        }

        return cart;
    }

    public Cart changeProductQuantityInCart(Long cartId, Long productId, Integer quantity) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException(cartId));
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));
        if(cart.getProducts().indexOf(product) == -1) throw new CartDoesNotHaveProductException(cartId, productId);

        if(quantity > 0) {
            cart.getQuantities().put(productId, quantity);
            cart.countTotalPrice();
        }

        cartRepository.save(cart);
        return cart;
    }

    public Cart deleteProductFromCart(Long cartId, Long productId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException(cartId));
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));

        if(cart.getProducts().indexOf(product) == -1) throw new CartDoesNotHaveProductException(cartId, productId);

        cart.getProducts().remove(product);
        cart.getQuantities().remove(productId);

        cartRepository.save(cart);

        return cart;
    }

    public void deleteCart(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException(cartId));
        cartRepository.delete(cart);
    }
}
