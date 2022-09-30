package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Terms;
import com.example.demo.entity.User;
import com.example.demo.service.TermsService;

@RestController
public class TermsController {
	
	 @Autowired
	    private TermsService services;

	    @GetMapping("/getTerms")
	    public Iterable<Terms>getTerms()
	    {
	        return services.listAll();
	    }
	    @PostMapping(value = "/saveTerms")
	    private long save(@RequestBody Terms terms)
	    {
	        services.saveOrUpdate(terms);
	        return  terms.getId();
	    }
	    
	    @RequestMapping("/term/{id}")
	    private Terms getTerms(@PathVariable(name = "id") int termid)
	    {
	        return services.getTermsById(termid);
	    }
	    @PutMapping("/editTerm/{id}")
	    private Terms update(@RequestBody Terms terms)
	    {
	        services.saveOrUpdate(terms);
	        return terms;
	    }
	    @DeleteMapping("/deleteTerm/{id}")
	    private void deleteTerms(@PathVariable("id") int id)
	    {
	        services.delete(id);
	    }

}
