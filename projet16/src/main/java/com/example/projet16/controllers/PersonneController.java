package com.example.projet16.controllers;



import com.example.projet16.dao.PersonneRepository;
import com.example.projet16.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;

    @GetMapping("/personnes")
    public List<Personne> getPersonnes(){
        return personneRepository.findAll();
    }

    @GetMapping("/personnes/{id}")
    public Personne getPersonne(@PathVariable("id") long id){
return personneRepository.findById(id).orElse(null);
    }

    @PostMapping("/personnes")
    public Personne addPersonnes(@RequestBody Personne personne){
return personneRepository.save(personne);
    }


}
