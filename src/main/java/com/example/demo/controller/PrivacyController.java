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
import com.example.demo.entity.Privacy;
import com.example.demo.service.PrivacyService;



@RestController
public class PrivacyController {

	 @Autowired
	    private PrivacyService services;

	    @GetMapping("/getPrivacy")
	    public Iterable<Privacy>getTerms()
	    {
	        return services.listAll();
	    }
	    @PostMapping(value = "/savePrivacy")
	    private long save(@RequestBody Privacy privacy)
	    {
	        services.saveOrUpdate(privacy);
	        return  privacy.getId();
	    }
	    
	    @RequestMapping("/privacy/{id}")
	    private Privacy getPrivacy(@PathVariable(name = "id") int privacyid)
	    {
	        return services.getPrivacyById(privacyid);
	    }
	    @PutMapping("/editPrivacy/{id}")
	    private Privacy update(@RequestBody Privacy privacy)
	    {
	        services.saveOrUpdate(privacy);
	        return privacy;
	    }
	    @DeleteMapping("/deletePrivacy/{id}")
	    private void deletePrivacy(@PathVariable("id") int id)
	    {
	        services.delete(id);
	    }

}
