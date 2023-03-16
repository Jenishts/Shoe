package com.sportyshoes.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;


    @Column(name="username", unique=true, nullable = false)
    private String userName;
    private String userAddress;
    private Long userPhone;


    public User(String userName, String userAddress, Long userPhone) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }
}
