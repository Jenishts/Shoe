package com.sportyshoes;

import com.sportyshoes.entity.Purchase;
import com.sportyshoes.entity.User;
import com.sportyshoes.entity.UserReg;
import com.sportyshoes.repo.PurchaseRepo;
import com.sportyshoes.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SportyShoesApplicationTests {


	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PurchaseRepo purchaseRepo;

	@Test
	void contextLoads() {
	}



	@Test
	void purchaselist(){
		User user=userRepo.findById(1).get();


//		List<Purchase> pd=purchaseRepo.findByPurchaseProduct();
//
//
//		System.out.println(pd);
		System.out.println(user);
	}





}
