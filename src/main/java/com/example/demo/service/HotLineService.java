package com.example.demo.service;

import com.example.demo.entity.Hotline;
import com.example.demo.entity.NormalPackages;
import com.example.demo.repository.HotCodeRepository;
import com.example.demo.repository.NormalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotLineService {
    @Autowired
    private HotCodeRepository repo;

    public Iterable<Hotline> listAll()
    {
        return this.repo.findAll();
    }
    public Hotline getHotlineById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(Hotline hotline)
    {
        repo.save(hotline);
    }
    public void update(Hotline hotline, int id)
    {
        repo.save(hotline);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}
