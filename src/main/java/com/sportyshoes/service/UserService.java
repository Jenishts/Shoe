package com.sportyshoes.service;


import com.sportyshoes.entity.User;
import com.sportyshoes.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
    private UserRepo userRepo;


    public User createUser(User user){

        return userRepo.save(user);
    }

    public User find(int id){
        return userRepo.findById(id).get();
    }



}
