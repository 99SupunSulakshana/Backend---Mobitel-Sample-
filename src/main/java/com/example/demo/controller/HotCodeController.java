package com.example.demo.controller;

import com.example.demo.entity.Hotline;
import com.example.demo.entity.NormalPackages;
import com.example.demo.service.HotLineService;
import com.example.demo.service.NormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotCodeController {
    @Autowired
    private HotLineService services;

    @GetMapping("/getHotline")
    public Iterable<Hotline> getHotline()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveHotline")
    public long save(@RequestBody Hotline hotline)
    {
        services.saveOrUpdate(hotline);
        return hotline.getId();
    }
    @RequestMapping("/Hotline/{id}")
    private Hotline getHotline(@PathVariable(name = "id") int packageId)
    {
        return services.getHotlineById(packageId);
    }
    @PutMapping("/editHotline/{id}")
    private Hotline update(@RequestBody Hotline hotline)
    {
        services.saveOrUpdate(hotline);
        return hotline;
    }
    @DeleteMapping("/deleteHotline/{id}")
    private void deleteHotline(@PathVariable("id") int id)
    {
        services.delete(id);
    }
}
