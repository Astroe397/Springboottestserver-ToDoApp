package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskService{

    @Autowired
    private TaskRepo TaskRepo;

    public void addTask(String title , String desc){
        Task task = new Task(title,desc);
        TaskRepo.save(task);

    }
    public List<Task> getAllTasks(){

        return TaskRepo.findAll();
    }
}