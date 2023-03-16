package com.sportyshoes.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OrderHistory {

    private String userName;
    private String productName;

    private String address;
    private LocalDateTime orderedDate;
}
