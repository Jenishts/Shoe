package com.sportyshoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchaseId;


    @ManyToOne
    @JoinColumn(name = "purchase_product_product_id")
    private Product purchaseProduct;

    @ManyToOne
    @JoinColumn(name = "purchased_by_user_id")
    private User purchasedBy;


    private LocalDateTime orderedTime;


    public Purchase(Product purchaseProduct, User purchasedBy, LocalDateTime orderedTime) {
        this.purchaseProduct = purchaseProduct;
        this.purchasedBy = purchasedBy;
        this.orderedTime = orderedTime;
    }
}
