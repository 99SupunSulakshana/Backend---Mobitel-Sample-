package com.example.demo.service;

import com.example.demo.entity.NormalPackages;
import com.example.demo.entity.Offers;
import com.example.demo.repository.NormalRepository;
import com.example.demo.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersService {

    @Autowired
    private OfferRepository repo;

    public Iterable<Offers> listAll()
    {
        return this.repo.findAll();
    }
    public Offers getOffersById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(Offers offers)
    {
        repo.save(offers);
    }
    public void update(Offers offers, int id)
    {
        repo.save(offers);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}
