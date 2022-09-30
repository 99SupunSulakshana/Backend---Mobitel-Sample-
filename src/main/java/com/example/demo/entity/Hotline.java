package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "hotcodes")
public class Hotline {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code_title")
    private String code_title;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "created_time")
    private String created_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode_title() {
        return code_title;
    }

    public void setCode_title(String code_title) {
        this.code_title = code_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    @Override
    public String toString() {
        return "Hotline{" +
                "id=" + id +
                ", code_title='" + code_title + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", created_time='" + created_time + '\'' +
                '}';
    }
}
