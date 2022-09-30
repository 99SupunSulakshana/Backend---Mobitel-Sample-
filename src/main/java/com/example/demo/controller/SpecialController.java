package com.example.demo.controller;

import com.example.demo.entity.SpecialPackages;
import com.example.demo.entity.WeeklyPackages;
import com.example.demo.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpecialController {

    @Autowired
    private SpecialService services;

    @GetMapping("/getSpecialpackage")
    public Iterable<SpecialPackages> getWeeklyPackages()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveSpecialPackage")
    public long save(@RequestBody SpecialPackages specialPackages)
    {
        services.saveOrUpdate(specialPackages);
        return specialPackages.getId();
    }
    @RequestMapping("/SpecialPackage/{id}")
    private SpecialPackages getSpecialpackage(@PathVariable(name = "id") int packageId)
    {
        return services.getSpecialPackageById(packageId);
    }
    @PutMapping("/editSpecialPackage/{id}")
    private SpecialPackages update(@RequestBody SpecialPackages specialPackages)
    {
        services.saveOrUpdate(specialPackages);
        return specialPackages;
    }
    @DeleteMapping("/deleteSpecialPackage/{id}")
    private void deleteSpecialPackage(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
