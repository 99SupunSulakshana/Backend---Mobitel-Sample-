package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aboutus")
public class AboutUs {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 @Column(name = "provider")
	 private String provider;
	 
	 @Column(name = "description")
	 private String description;
	 
	 @Column(name = "description2")
	 private String description2;
	 
	 @Column(name = "created_time")
		// @Temporal(TemporalType.TIMESTAMP)
		 private java.util.Date created_time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public java.util.Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(java.util.Date created_time) {
		this.created_time = created_time;
	} 

	@Override
	public String toString() {
		return "AboutUs [id=" + id + ", provider=" + provider + ", description=" + description + ", description2="
				+ description2 + ", created_time=" + created_time + ", getId()=" + getId() + ", getProvider()="
				+ getProvider() + ", getDescription()=" + getDescription() + ", getDescription2()=" + getDescription2()
				+ ", getCreated_time()=" + getCreated_time() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



}
