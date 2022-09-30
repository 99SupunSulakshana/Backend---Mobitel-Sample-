package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 @Column(name = "transaction_to")
	 private String transaction_to;
	 
	 @Column(name = "transaction_from")
	 private String transaction_from;
	 
	 @Column(name = "amount")
	 private String amount;
	 
	 @Column(name = "created_time")
		// @Temporal(TemporalType.TIMESTAMP)
		 private java.util.Date created_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTransaction_to() {
		return transaction_to;
	}

	public void setTransaction_to(String transaction_to) {
		this.transaction_to = transaction_to;
	}

	public String getTransaction_from() {
		return transaction_from;
	}

	public void setTransaction_from(String transaction_from) {
		this.transaction_from = transaction_from;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public java.util.Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(java.util.Date created_time) {
		this.created_time = created_time;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", transaction_to=" + transaction_to + ", transaction_from=" + transaction_from
				+ ", amount=" + amount + ", created_time=" + created_time + ", getId()=" + getId()
				+ ", getTransaction_to()=" + getTransaction_to() + ", getTransaction_from()=" + getTransaction_from()
				+ ", getAmount()=" + getAmount() + ", getCreated_time()=" + getCreated_time() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
	 

}
