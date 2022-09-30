package com.example.demo.service;

import com.example.demo.entity.LoginInfo;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private static LoginRepository repo;

    public static LoginInfo loginInfo(String username, String password){
        LoginInfo user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}
