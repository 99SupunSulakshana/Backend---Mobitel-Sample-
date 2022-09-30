package com.example.demo.service;

import com.example.demo.entity.SpecialPackages;
import com.example.demo.entity.WeeklyPackages;
import com.example.demo.repository.SpecialRepository;
import com.example.demo.repository.WeeklyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialService {
    @Autowired
    private SpecialRepository repo;

    public Iterable<SpecialPackages> listAll()
    {
        return this.repo.findAll();
    }
    public SpecialPackages getSpecialPackageById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(SpecialPackages specialPackages)
    {
        repo.save(specialPackages);
    }
    public void update(SpecialPackages specialPackages, int id)
    {
        repo.save(specialPackages);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }

}
