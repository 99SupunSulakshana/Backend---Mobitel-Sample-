package com.example.demo.controller;

import com.example.demo.entity.NormalPackages;
import com.example.demo.entity.Offers;
import com.example.demo.service.NormalService;
import com.example.demo.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OfferController {

    @Autowired
    private OffersService services;

    @GetMapping("/getOffers")
    public Iterable<Offers> getOffers()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveOffers")
    public long save(@RequestBody Offers offers)
    {
        services.saveOrUpdate(offers);
        return offers.getId();
    }
    @RequestMapping("/Offers/{id}")
    private Offers getOffers(@PathVariable(name = "id") int packageId)
    {
        return services.getOffersById(packageId);
    }
    @PutMapping("/editOffers/{id}")
    private Offers update(@RequestBody Offers offers)
    {
        services.saveOrUpdate(offers);
        return offers;
    }
    @DeleteMapping("/deleteOffers/{id}")
    private void deleteOffers(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
