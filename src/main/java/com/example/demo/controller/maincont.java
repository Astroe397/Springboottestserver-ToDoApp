package com.example.demo.controller;

import com.example.demo.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class maincont{

    @Autowired
    private taskService taskService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/submit")
    public String getTask(@RequestParam("title") String title , @RequestParam("desc") String desc){
        taskService.addTask(title,desc);
        return "index";
    }
    @GetMapping("/tasks")
    public String showTask(Model model){
        model.addAttribute("tasks",taskService.getAllTasks());
        return "tasks";
    }
}