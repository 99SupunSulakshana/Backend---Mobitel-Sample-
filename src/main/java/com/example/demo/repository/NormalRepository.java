package com.example.demo.repository;

import com.example.demo.entity.NormalPackages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalRepository extends CrudRepository<NormalPackages, Long> {
}
