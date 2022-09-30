package com.example.demo.service;

import com.example.demo.entity.WeeklyPackages;
import com.example.demo.repository.WeeklyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeeklyService {

    @Autowired
    private WeeklyRepository repo;
    public Iterable<WeeklyPackages> listAll()
    {
        return this.repo.findAll();
    }
    public WeeklyPackages getWeeklyPackageById(long id)
    {
        return repo.findById(id).get();
    }
    public void saveOrUpdate(WeeklyPackages weeklyPackages)
    {
        repo.save(weeklyPackages);
    }
    public void update(WeeklyPackages weeklyPackages, int id)
    {
        repo.save(weeklyPackages);
    }
    public void delete  (long id)
    {
        repo.deleteById(id);
    }

}
