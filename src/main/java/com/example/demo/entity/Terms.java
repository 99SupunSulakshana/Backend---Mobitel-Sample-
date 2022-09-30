package com.example.demo.entity;



import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="terms")
public class Terms {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 @Column(name = "term_name")
	 private String term_name;
	 
	 @Column(name = "description")
	 private String description;
	 
	 @Column(name = "created_time")
	// @Temporal(TemporalType.TIMESTAMP)
//	 private java.util.Date created_time;
	 private String created_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}

	@Override
	public String   toString() {
		return "Terms{" +
				"id=" + id +
				", term_name='" + term_name + '\'' +
				", description='" + description + '\'' +
				", created_time='" + created_time + '\'' +
				'}';
	}
}
