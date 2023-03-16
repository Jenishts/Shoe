package com.sportyshoes.service;

import com.sportyshoes.entity.Purchase;
import com.sportyshoes.repo.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {


    @Autowired
    private UserService userService;

    @Autowired
    private PurchaseRepo purchaseRepo;

    @Autowired
    private ProductService productService;


    public Purchase newOrder(int userId, int productId){

        Purchase purchase=new Purchase(productService.findbyId(productId), userService.find(userId), LocalDateTime.now());


        return purchaseRepo.save(purchase);
    }

//    public List<Purchase> orderHistorybyUserId(int id){
//
//        return purchaseRepo.findByPurchaseProduct(id);
//    }

}
