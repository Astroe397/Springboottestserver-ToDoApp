package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TaskClass {

    @Id
    @GeneratedValue
    private int id;
    private String name;


    public TaskClass() {}

    public TaskClass(String inname,int inid) {
        this.name = inname;
        this.id = inid;
    }

    public String getName(){return name;}
    public int getId(){return id;}



}
