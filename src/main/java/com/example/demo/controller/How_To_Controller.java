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
import com.example.demo.entity.How_to_guide;
import com.example.demo.service.How_To_Guide_Service;

@RestController
public class How_To_Controller {
	
	@Autowired
    private How_To_Guide_Service services;

    @GetMapping("/getGuide")
    public Iterable<How_to_guide>getHow_to_guide()
    {
        return services.listAll();
    }
    @PostMapping(value = "/saveGuide")
    private long save(@RequestBody How_to_guide how_to_guide)
    {
        services.saveOrUpdate(how_to_guide);
        return  how_to_guide.getId();
    }
    
    @RequestMapping("/Guide/{id}")
    private How_to_guide getHow_to_guide(@PathVariable(name = "id") int how_to_guideid)
    {
        return services.getHow_to_guideId(how_to_guideid);
    }
    @PutMapping("/editGuide/{id}")
    private How_to_guide update(@RequestBody How_to_guide how_to_guide)
    {
        services.saveOrUpdate(how_to_guide);
        return how_to_guide;
    }
    @DeleteMapping("/deleteGuide/{id}")
    private void deleteGuide(@PathVariable("id") int id)
    {
        services.delete(id);
    }

}
