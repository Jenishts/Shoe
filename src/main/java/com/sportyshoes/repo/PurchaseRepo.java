package com.sportyshoes.repo;

import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.Purchase;
import com.sportyshoes.entity.User;
import com.sportyshoes.entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Integer> {

//    @Query(value = "select * from purchase where purchased_by_user_id=:userId", nativeQuery = true)
//    Optional<Purchase[]> findByUser(@Param("id") int userId);

//    @Query(value = "from Purchase p left join p.User u;")
//    List<Purchase> findByPurchaseProduct();


}
