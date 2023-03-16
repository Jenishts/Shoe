package com.sportyshoes.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
        private String productName;
    private int productSize;

    private String productColor;


    public void Product(String productName, int productSize, String productColor) {
        this.productName = productName;
        this.productSize = productSize;
        this.productColor = productColor;
    }
}
