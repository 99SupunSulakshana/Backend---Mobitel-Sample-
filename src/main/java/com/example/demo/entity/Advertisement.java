package com.example.demo.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="advertisements")
public class Advertisement {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 @Column(name = "name")
	 private String name;
	 
	 @Column(name = "description")
	 private String description;
	 
//	 @Column(name = "image")
//	 private byte [] image;

	 @Column(name = "created_time")
		// @Temporal(TemporalType.TIMESTAMP)
	//	 private java.util.Date created_time;
	 private String created_time;
	 
//	public java.util.Date getCreated_time() {
//		return created_time;
//	}

//	public void setCreated_time(java.util.Date created_time) {
//		this.created_time = created_time;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	//
//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}


	@Override
	public String toString() {
		return "Advertisement{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", created_time='" + created_time + '\'' +
				'}';
	}
}
