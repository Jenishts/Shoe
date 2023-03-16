package com.sportyshoes.controller;

import com.sportyshoes.entity.*;
import com.sportyshoes.model.UserModel;
import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.PurchaseService;
import com.sportyshoes.service.UserRegService;
import com.sportyshoes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class mainController {

    @Autowired
    private UserRegService userRegService;
    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Autowired
    PurchaseService purchaseService;


//***************Product ***************************
    @GetMapping("/list")
    public List<Product> products(){
        return productService.productList();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
      return  productService.addItem(product);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        return productService.deleteItem(id);
    }


//    ******************** User ****************************************


    @PostMapping("/adduser")
    public User addUser(@RequestBody  User user){
        return userService.createUser(user);
    }




    @PostMapping("/registeruser")
    public String registerUser(@RequestBody UserModel userModel){

        UserReg userReg=userRegService.registerUser(userModel);
        return "Success";

    }




//    ************************** Purchase ***********************

    @PostMapping("/purchase/")
    public void purchase(@RequestBody Order order){
//        return purchaseService.newOrder(uid, pid);

        System.out.println(order.toString());
    }







    //***************Create user***************



    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello, I am admin. ";
    }


}


