package com.sportyshoes.service;

import com.sportyshoes.entity.Product;
import com.sportyshoes.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;


    public Product addItem(Product product){ // create new product
        return productRepo.save(product);
    }


    public List<Product> productList(){
        return productRepo.findAll();
    }


    public Product findbyId(int id){
        return productRepo.findById(id).get();
    }

    public String deleteItem(int id){

       if( productRepo.findById(id).isEmpty()){
           return "item not found";
       }else{
           productRepo.delete(productRepo.findById(id).get());
           return "Deleted";
       }

    }




}
