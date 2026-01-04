package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDto {
    private Long id;

    @Size(min = 3, max = 80, message = "O nome deve ter entre 3 a 80 caracteres")
    @NotBlank(message = "Campo nome é obrigatório")
    private String name;

    @Size(min = 10, message = "Descrição deve ter no minimo 10 caracteres")
    @NotBlank(message = "Campo descrição é obrigatório")
    private String description;

    @Positive(message = "Campo preço não aceita negativo")
    private Double price;
    private String imgUrl;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDto(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
