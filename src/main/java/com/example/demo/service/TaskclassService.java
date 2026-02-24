package com.example.demo.service;


import com.example.demo.model.TaskClass;
import com.example.demo.repository.Taskrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskclassService {
    private final Taskrepo TaskClassRepository;

    public void TaskClassService(Taskrepo TaskClassRepository) {
        this.TaskClassRepository = TaskClassRepository;
    }
    public List<TaskClass> getalltasks(){
        return TaskClassRepository.findAll();
    }
}
