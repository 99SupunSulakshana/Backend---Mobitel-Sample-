package com.example.demo.repository;

import com.example.demo.entity.SpecialPackages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialRepository extends CrudRepository<SpecialPackages, Long> {
}
