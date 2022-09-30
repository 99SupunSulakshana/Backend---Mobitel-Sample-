package com.example.demo.repository;

import com.example.demo.entity.PopularPackages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularRepository extends CrudRepository<PopularPackages, Long> {
}
