package com.example.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.AboutUs;
import com.example.demo.exception.AboutUsNotFoundException;
import com.example.demo.service.AboutUsService;


@RestController
public class AboutUsController {

	@Autowired
    private AboutUsService services;

    @GetMapping("/AboutUs")
    public Iterable<AboutUs>getAboutUs()
    {
        return this.services.listAll();
    }
    @PostMapping(value = "/addAboutUs")
    private ResponseEntity<Object> save(@RequestBody AboutUs aboutUs)
    {
        services.saveOrUpdate(aboutUs);
       // return aboutUs.getId();
        URI newAboutUsLocation = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{AboutUsId}")
        .buildAndExpand(aboutUs.getId())
        .toUri();
		return ResponseEntity.created(newAboutUsLocation).build();
    }
    
    @RequestMapping("/AboutUs/{id}")
    private AboutUs getAboutUs(@PathVariable(name = "id") int aboutUsid)
    {
    	AboutUs aboutUs = services.getAboutUsById(aboutUsid);
    	if(aboutUs == null) {
    		throw new AboutUsNotFoundException("Not Found User Inserted AboutUs"+ aboutUsid);
    	}
        return aboutUs;
    }
    @PutMapping("/editAboutUs/{id}")
    private AboutUs update(@RequestBody AboutUs aboutUs)
    {
        services.saveOrUpdate(aboutUs);
        return aboutUs;
    }
    @DeleteMapping("/deleteAboutUs/{id}")
    private void deleteAboutUs(@PathVariable("id") int id)
    {
        services.delete(id);
    }

}
