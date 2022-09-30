package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Advertisement;
import com.example.demo.entity.Privacy;
import com.example.demo.repository.AdvertisementRepository;

@Service
public class AdvertisementService {
	@Autowired
	 private AdvertisementRepository repo;
	public Iterable<Advertisement> listAll(){
        return this.repo.findAll();
    }
    public Advertisement getAdvertisementById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(Advertisement advertisement){
        repo.save(advertisement);
    }

    public void update(Advertisement advertisement, int id)
    {
        repo.save(advertisement);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
