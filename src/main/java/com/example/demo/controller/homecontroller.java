package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/press")
    public String pressbutton(Model model){
        model.addAttribute("message","button was pressed");
        System.out.println("yesitworked");
        return "index";
    }
}
