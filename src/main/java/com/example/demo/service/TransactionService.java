package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Terms;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.TermsRepository;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	 private TransactionRepository repo;
	 public Iterable<Transaction> listAll(){
	        return this.repo.findAll();
	    }
	    public Transaction getTransactionById(long id)
	    {
	        return repo.findById(id).get();
	    }
	    public void saveOrUpdate(Transaction transaction){
	        repo.save(transaction);
	    }

	    public void update(Transaction transaction, int id)
	    {
	        repo.save(transaction);
	    }

	    public void delete(long id){
	        repo.deleteById(id);
	    }

}
