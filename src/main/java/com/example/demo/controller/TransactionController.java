package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Terms;
import com.example.demo.entity.Transaction;
import com.example.demo.service.TermsService;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {
	 
	 @Autowired
	    private TransactionService services;

	    @GetMapping("/getTransaction")
	    public Iterable<Transaction>getTransaction()
	    {
	        return services.listAll();
	    }
	    @PostMapping(value = "/saveTransaction")
	    private long save(@RequestBody Transaction transaction)
	    {
	        services.saveOrUpdate(transaction);
	        return  transaction.getId();
	    }
	    
	    @RequestMapping("/Transaction/{id}")
	    private Transaction geTransaction(@PathVariable(name = "id") int transactionid)
	    {
	        return services.getTransactionById(transactionid);
	    }
	    @PutMapping("/editTransaction/{id}")
	    private Transaction update(@RequestBody Transaction transaction)
	    {
	        services.saveOrUpdate(transaction);
	        return transaction;
	    }
	    @DeleteMapping("/deleteTransaction/{id}")
	    private void deleteTransaction(@PathVariable("id") int id)
	    {
	        services.delete(id);
	    }
}
