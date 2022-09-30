package com.example.demo.repository;

import com.example.demo.entity.WeeklyPackages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyRepository extends CrudRepository<WeeklyPackages, Long> {
}
