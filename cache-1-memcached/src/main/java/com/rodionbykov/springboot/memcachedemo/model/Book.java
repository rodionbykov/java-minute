package com.rodionbykov.springboot.memcachedemo.model;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID  = 1L;

    private Integer id;
    private String title;
    private Integer year;

    public Book(Integer id, String title, Integer year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}