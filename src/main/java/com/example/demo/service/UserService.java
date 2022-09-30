package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public Iterable<User> listAll(){
        return this.repo.findAll();
    }
    public User getUserById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(User users){
        repo.save(users);
    }

    public void update(User users, int id)
    {
        repo.save(users);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
 