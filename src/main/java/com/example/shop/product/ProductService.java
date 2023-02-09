package com.example.shop.product;

import com.example.shop.exceptions.ProductAlreadyExistsException;
import com.example.shop.exceptions.ProductNotFoundException;
import com.example.shop.exceptions.ProductPriceInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private Float roundPrice(Float price) {
        return Math.round(price * 100f) / 100f;
    }

    Product getProduct(Long productId){
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));
        return product;
    }

    List<Product> getProducts(){
        return productRepository.findAll();
    }

    void addProduct(ProductCreateDTO productCreateDTO){
        Boolean isProductExists = productRepository.existsByName(productCreateDTO.getName());

        if(isProductExists) throw new ProductAlreadyExistsException();
        if(productCreateDTO.getPrice() < 0.01) throw new ProductPriceInvalidException(productCreateDTO.getPrice());

        Product newProduct = new Product();
        newProduct.setName(productCreateDTO.getName());
        newProduct.setPrice(roundPrice(productCreateDTO.getPrice()));
        newProduct.setDescription(productCreateDTO.getDescription());

        productRepository.save(newProduct);
    }

    void editProduct(Long productId, ProductEditDTO productEditDTO){
        Product productToEdit = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));

        if(productEditDTO.getPrice() != null && productEditDTO.getPrice() < 0.01) throw new ProductPriceInvalidException(productEditDTO.getPrice());
        if(productEditDTO.getName() != null && !productEditDTO.getName().equals("")) productToEdit.setName(productEditDTO.getName());
        if(productEditDTO.getDescription() != null && !productEditDTO.getName().equals("")) productToEdit.setDescription(productEditDTO.getDescription());
        if(productEditDTO.getPrice() != null) productToEdit.setPrice(roundPrice(productEditDTO.getPrice()));

        productRepository.save(productToEdit);
    }

    public void deleteProduct(Long productId) {
        productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));
        productRepository.deleteById(productId);
    }
}
