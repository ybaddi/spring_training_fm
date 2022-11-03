package com.example.example_spring_boot_1.controllers;


import com.example.example_spring_boot_1.dao.PersonneRepository;
import com.example.example_spring_boot_1.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/personne/")
public class PersonneController {

    @Autowired
    PersonneRepository pr;

    @GetMapping("/add")
    public String add(){
        return "personne/add";
    }

    @PostMapping("/add")
    public String add(@RequestParam String nom,
                      @RequestParam String prenom,
                      Model model){
        Personne p = new Personne(nom,prenom);
        System.out.println(pr.save(p));
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("personnes", pr.findAll());
        return "personne/show";
    }
}
