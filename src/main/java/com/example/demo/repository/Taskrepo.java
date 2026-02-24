package com.example.demo.repository;

import com.example.demo.model.TaskClass;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Taskrepo extends JpaRepository<TaskClass, Integer> {
    // Integer because your id is an int
}
