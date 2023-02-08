package com.example.shop.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    @Column(name="product_id", nullable = false)
    private Long id;

    @NotBlank(message = "Product name should not be empty or null!")
    @Column(name="product_name", nullable = false)
    private String name;

    @NotBlank(message = "Product description should not be empty or null!")
    @Column(name="product_description", nullable = false)
    private String description;

    @NotNull(message = "Product price should not be null!")
    @Column(name="product_price", nullable = false)
    private Float price;
}
