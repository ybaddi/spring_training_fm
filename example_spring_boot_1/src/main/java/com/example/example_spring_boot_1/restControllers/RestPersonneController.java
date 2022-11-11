package com.example.example_spring_boot_1.restControllers;


import com.example.example_spring_boot_1.dao.AdresseRepository;
import com.example.example_spring_boot_1.dao.PersonneRepository;
import com.example.example_spring_boot_1.model.Adresse;
import com.example.example_spring_boot_1.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/personne/")
public class RestPersonneController {

    @Autowired
    PersonneRepository personneRepository;

    @Autowired
    AdresseRepository adresseRepository;

    @GetMapping("/add")
    public String add(){

        return "thymleaf/personne/add";
    }

    @PostMapping("/add")
    @ResponseBody
    public Personne addPersonne(@RequestBody Personne personne) {
        System.out.println(personne);
        System.out.println(personne);
        List <Adresse> adresses = personne.getAdresses();
        for (Adresse adresse : adresses) {
            Adresse adr = null;
            if (adresse.getId() != null) {
                adr = adresseRepository.findById(adresse.getId()).orElse(
                        null);
                adresses.set(adresses.indexOf(adresse), adr);
            } else {
                adr = adresseRepository.save(adresse);
            }
        }
        return personneRepository.saveAndFlush(personne);
    }

    @GetMapping(value = "/show", produces = { MediaType.
            APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Personne> getPersonnes() {
        return personneRepository.findAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Personne getPersonne(@PathVariable("id") long id) {
        return personneRepository.findById(id).orElse(null);
    }
}
