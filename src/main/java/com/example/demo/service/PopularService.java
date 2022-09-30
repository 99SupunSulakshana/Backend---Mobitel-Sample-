package com.example.demo.service;

import com.example.demo.entity.PopularPackages;
import com.example.demo.entity.SpecialPackages;
import com.example.demo.repository.PopularRepository;
import com.example.demo.repository.SpecialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopularService {
    @Autowired
    private PopularRepository repo;

    public Iterable<PopularPackages> listAll()
    {
        return this.repo.findAll();
    }
    public PopularPackages getPopularPackagesById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(PopularPackages popularPackages)
    {
        repo.save(popularPackages);
    }
    public void update(PopularPackages popularPackages, int id)
    {
        repo.save(popularPackages);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}
