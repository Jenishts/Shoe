package com.sportyshoes.service;

import com.sportyshoes.entity.UserReg;
import com.sportyshoes.model.CustomUserDetails;
import com.sportyshoes.repo.UserRegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetails_S implements UserDetailsService {

    @Autowired
    private UserRegRepo userRegRepo;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserReg userReg=userRegRepo.findByEmail(email);
        if(userReg==null){
            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetails(userReg);
    }
}
