package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AboutUs;
import com.example.demo.entity.Advertisement;
import com.example.demo.repository.AboutusRepository;
import com.example.demo.repository.AdvertisementRepository;

@Service
public class AboutUsService {
	
	@Autowired
	private AboutusRepository repo;
	public Iterable<AboutUs> listAll(){
        return this.repo.findAll();
    }
    public AboutUs getAboutUsById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(AboutUs aboutUs){
        repo.save(aboutUs);
    }

    public void update(AboutUs aboutUs, int id)
    {
        repo.save(aboutUs);
    }

    public void delete(long id){
        repo.deleteById(id);
    }


}
