package com.example.example_spring_boot_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Homecontroller {

    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("nom", "baddi");
        return "home";
    }

    @GetMapping("login")
    public String login(Model model){
//        model.addAttribute("nom", "baddi");
        return "login";
    }
}
