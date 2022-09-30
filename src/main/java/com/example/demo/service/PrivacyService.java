package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Privacy;
import com.example.demo.entity.Terms;
import com.example.demo.repository.PrivacyRepository;
import com.example.demo.repository.TermsRepository;

@Service
public class PrivacyService {
	@Autowired
	 private PrivacyRepository repo;
	 public Iterable<Privacy> listAll(){
	        return this.repo.findAll();
	    }
	    public Privacy getPrivacyById(long id)
	    {
	        return repo.findById(id).get();
	    }
	    public void saveOrUpdate(Privacy privacy){
	        repo.save(privacy);
	    }

	    public void update(Privacy privacy, int id)
	    {
	        repo.save(privacy);
	    }

	    public void delete(long id){
	        repo.deleteById(id);
	    }
	    
}
