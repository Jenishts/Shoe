package com.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SportyShoesApplication {

//	PasswordEncoder passwordEncoder(String password){
//		return new BCryptPasswordEncoder(password);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}

}
