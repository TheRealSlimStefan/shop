package com.example.shop.cart;

import com.example.shop.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="carts")
public class Cart {
    @Id
    @SequenceGenerator(
            name = "cart_sequence",
            sequenceName = "cart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cart_sequence"
    )
    @Column(name="cart_id", nullable = false)
    private Long id;

    @ManyToMany
    private List<Product> products;

    private Float totalPrice;

    @ElementCollection
    private Map<Long, Integer> quantities;

    public Cart() {
        this.products = new ArrayList<>();
        this.quantities = new HashMap<>();
        this.totalPrice = 0f;
    }

    public void countTotalPrice(){
        this.totalPrice = 0f;

        this.products.forEach(product -> {
            this.totalPrice += product.getPrice() * quantities.get(product.getId());
        });

        this.totalPrice = Math.round(this.totalPrice * 100) / 100f;
    }
}
