package com.example.demo.controller;

import com.example.demo.entity.NormalPackages;
import com.example.demo.entity.PopularPackages;
import com.example.demo.service.NormalService;
import com.example.demo.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NormalController {
    @Autowired
    private NormalService services;

    @GetMapping("/getNormalpackage")
    public Iterable<NormalPackages> getNormalPackages()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveNormalPackage")
    public long save(@RequestBody NormalPackages normalPackages)
    {
        services.saveOrUpdate(normalPackages);
        return normalPackages.getId();
    }
    @RequestMapping("/NormalPackage/{id}")
    private NormalPackages getNormalPackages(@PathVariable(name = "id") int packageId)
    {
        return services.getNormalPackagesById(packageId);
    }
    @PutMapping("/editNormalPackage/{id}")
    private NormalPackages update(@RequestBody NormalPackages popularPackages)
    {
        services.saveOrUpdate(popularPackages);
        return popularPackages;
    }
    @DeleteMapping("/deleteNormalPackage/{id}")
    private void deleteNormalPackages(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
