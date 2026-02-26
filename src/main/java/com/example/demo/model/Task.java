package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String desc;

    public Task(){}
    public Task(String x, String y){
        this.title=x;
        this.desc=y;
    }

    public String getTitle() { return this.title; }
    public String getDesc() { return this.desc; }

}