package com.example.example_spring_boot_1.restControllers;


import com.example.example_spring_boot_1.dao.PersonneRepository;
import com.example.example_spring_boot_1.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/personne/")
public class RestPersonneController {

    @Autowired
    PersonneRepository pr;

    @GetMapping("/add")
    public String add(){

        return "thymleaf/personne/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("personne") Personne personne, Model model){
        System.out.println(pr.save(personne));
        return "redirect:/personne/show";
    }

    @GetMapping("/show")
    @ResponseBody
    public String show(Model model){
        model.addAttribute("personnes", pr.findAll());
        return "personne/show";
    }
}
