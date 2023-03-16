package com.sportyshoes.repo;

import com.sportyshoes.entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegRepo extends JpaRepository<UserReg, Long> {


    public UserReg findByEmail(String email);
}
