package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Terms;
import com.example.demo.entity.User;
import com.example.demo.repository.TermsRepository;

@Service
public class TermsService {

	@Autowired
	 private TermsRepository repo;
	 public Iterable<Terms> listAll(){
	        return this.repo.findAll();
	    }
	    public Terms getTermsById(long id)
	    {
	        return repo.findById(id).get();
	    }
	    public void saveOrUpdate(Terms terms){
	        repo.save(terms);
	    }

	    public void update(Terms terms, int id)
	    {
	        repo.save(terms);
	    }

	    public void delete(long id){
	        repo.deleteById(id);
	    }
}
