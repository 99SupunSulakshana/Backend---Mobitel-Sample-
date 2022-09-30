package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privacy")
public class Privacy {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	 @Column(name = "privacy_name")
	 private String privacy_name;
	 
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

	public String getPrivacy_name() {
		return privacy_name;
	}

	public void setPrivacy_name(String privacy_name) {
		this.privacy_name = privacy_name;
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
	public String toString() {
		return "Privacy{" +
				"id=" + id +
				", privacy_name='" + privacy_name + '\'' +
				", description='" + description + '\'' +
				", created_time='" + created_time + '\'' +
				'}';
	}
}
