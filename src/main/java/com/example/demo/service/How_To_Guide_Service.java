package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AboutUs;
import com.example.demo.entity.How_to_guide;
import com.example.demo.repository.AboutusRepository;
import com.example.demo.repository.How_To_GuideRepository;

@Service
public class How_To_Guide_Service {
	
	@Autowired
	private How_To_GuideRepository repo;
	
	public Iterable<How_to_guide> listAll(){
        return this.repo.findAll();
    }
    public How_to_guide getHow_to_guideId(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(How_to_guide how_to_guide){
        repo.save(how_to_guide);
    }

    public void update(How_to_guide how_to_guide, int id)
    {
        repo.save(how_to_guide);
    }

    public void delete(long id){
        repo.deleteById(id);
    }

}
