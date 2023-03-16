package com.sportyshoes.repo;

import com.sportyshoes.entity.OrderHistory;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface IOrderHistory {

    String getuserName();
    String getuserAddress();

    String getproductName();
    LocalDateTime getorderedTime();

}
