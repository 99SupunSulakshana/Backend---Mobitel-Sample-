package com.example.demo.service;

import com.example.demo.entity.NormalPackages;
import com.example.demo.entity.PopularPackages;
import com.example.demo.repository.NormalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NormalService {

    @Autowired
    private NormalRepository repo;

    public Iterable<NormalPackages> listAll()
    {
        return this.repo.findAll();
    }
    public NormalPackages getNormalPackagesById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(NormalPackages normalPackages)
    {
        repo.save(normalPackages);
    }
    public void update(NormalPackages normalPackages, int id)
    {
        repo.save(normalPackages);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}
