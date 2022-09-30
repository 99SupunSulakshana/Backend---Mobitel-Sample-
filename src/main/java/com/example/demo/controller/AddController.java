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
import com.example.demo.entity.Advertisement;
import com.example.demo.service.AdvertisementService;


@RestController
public class AddController {
	
	@Autowired
    private AdvertisementService services;

    @GetMapping("/getAdvertisement")
    public Iterable<Advertisement>getAdvertisement()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveAdvertisement")
    private long save(@RequestBody Advertisement advertisement)
    {
        services.saveOrUpdate(advertisement);
        return  advertisement.getId();
    }
    
    @RequestMapping("/Advertisement/{id}")
    private Advertisement getAdvertisement(@PathVariable(name = "id") int advertisementid)
    {
        return services.getAdvertisementById(advertisementid);
    }
    @PutMapping("/editAdvertisement/{id}")
    private Advertisement update(@RequestBody Advertisement advertisement)
    {
        services.saveOrUpdate(advertisement);
        return advertisement;
    }
    @DeleteMapping("/deleteAdvertisement/{id}")
    private void deleteAdvertisement(@PathVariable("id") int id)
    {
        services.delete(id);
    }

}
