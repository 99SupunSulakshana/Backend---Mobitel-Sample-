package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AboutUs;

@Repository
public interface AboutusRepository extends CrudRepository<AboutUs, Long>{

}
