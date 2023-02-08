package com.example.shop.product;

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
public class ProductCreateDTO {
    @NotBlank(message = "Product name should not be empty or null!")
    private String name;

    @NotBlank(message = "Product description should not be empty or null!")
    private String description;

    @NotNull(message = "Product price should not be null!")
    private Float price;
}
