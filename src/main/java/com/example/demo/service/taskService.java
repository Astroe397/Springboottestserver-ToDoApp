package com.example.demo.service;


import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class taskService {

    private final TaskRepo taskRepo;

    public taskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }


    public Task saveTask(String title, String desc){
        Task task = new Task(title,desc);
        System.out.println(task.description);
        System.out.println(task.title);
        return taskRepo.save(task);
    }

}
