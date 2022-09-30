package com.example.demo.controller;

import com.example.demo.entity.PopularPackages;
import com.example.demo.entity.SpecialPackages;
import com.example.demo.service.PopularService;
import com.example.demo.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PopularController {
    @Autowired
    private PopularService services;

    @GetMapping("/getPopularpackage")
    public Iterable<PopularPackages> getPopularPackages()
    {
        return services.listAll();
    }
    @PostMapping(value = "/savePopularPackage")
    public long save(@RequestBody PopularPackages popularPackages)
    {
        services.saveOrUpdate(popularPackages);
        return popularPackages.getId();
    }
    @RequestMapping("/PopularPackage/{id}")
    private PopularPackages getSpecialpackage(@PathVariable(name = "id") int packageId)
    {
        return services.getPopularPackagesById(packageId);
    }
    @PutMapping("/editPopularPackage/{id}")
    private PopularPackages update(@RequestBody PopularPackages popularPackages)
    {
        services.saveOrUpdate(popularPackages);
        return popularPackages;
    }
    @DeleteMapping("/deletePopularPackage/{id}")
    private void deleteSpecialPackage(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
