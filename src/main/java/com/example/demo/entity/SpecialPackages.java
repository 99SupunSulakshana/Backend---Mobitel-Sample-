package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "special_packages")
public class SpecialPackages {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "package_title")
    private String package_title;

    @Column(name = "description")
    private String description;

    @Column(name = "cost")
    private String cost;

    @Column(name = "created_time")
    private String created_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPackage_title() {
        return package_title;
    }

    public void setPackage_title(String package_title) {
        this.package_title = package_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    @Override
    public String toString() {
        return "SpecialPackages{" +
                "id=" + id +
                ", package_title='" + package_title + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                ", created_time='" + created_time + '\'' +
                '}';
    }
}
