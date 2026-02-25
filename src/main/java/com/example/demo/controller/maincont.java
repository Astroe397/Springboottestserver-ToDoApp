package com.example.demo.controller;


import com.example.demo.service.taskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class maincont {
    private final taskService taskService;

    public maincont(taskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String inxed(){
        return "index";
    }


    @PostMapping("/submit")
    public String handlesubmit(@RequestParam("userMessage") String userMessage, @RequestParam("userDesk") String userDesk,Model model){
        String title = userMessage;
        String desc = userDesk;
        taskService.saveTask(title,desc);
        System.out.println("controller success");
        return "index";
    }
}
