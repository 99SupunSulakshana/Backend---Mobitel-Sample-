package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Advertisement;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement,Long>{

}
