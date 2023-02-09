package com.example.shop.product;

import com.example.shop.exceptions.ErrorResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") Long productId){
        Product product = productService.getProduct(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> listOfProducts = productService.getProducts();
        return new ResponseEntity<>(listOfProducts, HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Void> addProduct(@RequestBody @Valid ProductCreateDTO productCreateDTO){
        productService.addProduct(productCreateDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<Void> editProduct(@PathVariable("productId") Long productId, @RequestBody @Valid ProductEditDTO productEditDTO){
        productService.editProduct(productId, productEditDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("productId") Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
