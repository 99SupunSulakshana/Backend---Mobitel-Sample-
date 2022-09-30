package com.example.demo.repository;

import com.example.demo.entity.LoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginInfo, Long> {
    LoginInfo findByUsernameAndPassword(String username, String password);
}
