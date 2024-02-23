package com.zergatstage.s07secweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("/hello")
    public String mainPage(){
        return "hello";
    }

    @GetMapping("/public-data")
    public String getPublicData(Model model){
        model.addAttribute("sampleMessage", "Just text about pega for unauthenticated users");
        return "public-data";
    }
}
