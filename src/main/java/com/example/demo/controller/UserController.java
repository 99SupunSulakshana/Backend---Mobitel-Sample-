package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService services;

    @GetMapping("/getall")
    public Iterable<User>getUsers()
    {
        return services.listAll();
    }
    @PostMapping(value = "/save")
    private long saveUser(@RequestBody User users)
    {
        services.saveOrUpdate(users);
        return  users.getId();
    }
    @RequestMapping("/student/{id}")
    private User getUsers(@PathVariable(name = "id") int userid)
    {
        return services.getUserById(userid);
    }
    @PutMapping("/edit/{id}")
    private User update(@RequestBody User users)
    {
        services.saveOrUpdate(users);
        return users;
    }
    @DeleteMapping("/delete/{id}")
    private void deleteUser(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
