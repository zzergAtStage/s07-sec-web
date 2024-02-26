package com.zergatstage.s07secweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("/hello")
    public String mainPersonalizedPage(){
        return "hello";
    }

    @GetMapping("/home")
    public String mainPage(){return "public/home";}

    @GetMapping("/international")
    public String getInternationalPage() {
        return "public/thymeleaf/international";
    }
    @GetMapping("/public-data")
    public String getPublicData(Model model){
        model.addAttribute("sampleMessage", "Just text about page for unauthenticated users");
        model.addAttribute("bankRequisites", "Some Bank Name, Some SWIFT code");
        return "public/public-data";
    }

    @GetMapping("/private-data")
    public String console(){
        return "console";
    }
}
