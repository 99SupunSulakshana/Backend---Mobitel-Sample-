package com.example.demo.repository;

import com.example.demo.entity.Offers;
import org.springframework.data.repository.CrudRepository;

public interface OfferRepository extends CrudRepository<Offers, Long> {
}
