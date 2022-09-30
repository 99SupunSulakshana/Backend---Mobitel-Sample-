package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Terms;

@Repository
public interface TermsRepository extends CrudRepository<Terms,Long> {
	
}
