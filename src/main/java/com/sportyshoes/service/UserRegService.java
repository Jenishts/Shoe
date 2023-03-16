package com.sportyshoes.service;

import com.sportyshoes.entity.UserReg;
import com.sportyshoes.model.UserModel;
import com.sportyshoes.repo.UserRegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegService {

    @Autowired
    private UserRegRepo userRegRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserReg registerUser(UserModel userModel) {
        UserReg userReg=new UserReg();
        userReg.setFirstName(userModel.getFirstName());
        userReg.setLastName(userModel.getLastName());
        userReg.setPassword(passwordEncoder.encode(userModel.getPassword()));
        userReg.setEmail(userModel.getEmail());
        userReg.setRole("USER");

        userRegRepo.save(userReg);

        return userReg;

    }
}
