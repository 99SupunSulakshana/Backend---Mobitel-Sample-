package com.example.demo.controller;

import com.example.demo.entity.WeeklyPackages;
import com.example.demo.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeeklyPackageController {

    @Autowired
    private WeeklyService services;

    @GetMapping("/getWeeklyPackage")
    public Iterable<WeeklyPackages> getWeeklyPackages()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveWeeklyPackage")
    public long save(@RequestBody WeeklyPackages weeklyPackages)
    {
        services.saveOrUpdate(weeklyPackages);
        return weeklyPackages.getId();
    }
    @RequestMapping("/weeklyPackage/{id}")
    private WeeklyPackages getWeeklypackage(@PathVariable(name = "id") int packageId)
    {
        return services.getWeeklyPackageById(packageId);
    }
    @PutMapping("/editWPackage/{id}")
    private WeeklyPackages update(@RequestBody WeeklyPackages weeklyPackages)
    {
        services.saveOrUpdate(weeklyPackages);
        return weeklyPackages;
    }
    @DeleteMapping("/deleteWPackage/{id}")
    private void deleteWeeklyPackage(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
