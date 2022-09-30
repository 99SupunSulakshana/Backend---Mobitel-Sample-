package com.example.demo.repository;

import com.example.demo.entity.Hotline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotCodeRepository extends CrudRepository<Hotline, Long> {
}
