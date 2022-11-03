package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.dao.PersonneDao;
import com.mycompany.dao.PersonneRepository;
import com.mycompany.model.Personne;

@Controller
public class PersonneController {

	@Autowired
//	private PersonneDao personneDao;
	private PersonneRepository personneRepository;
	
	@GetMapping("addPersonne")
	public String addPersonne(){
		return "addPersonne";
	}
	
	@PostMapping("addPersonne")
	public String addNewPersonne(Personne p1){
		
		Personne p = personneRepository.save(p1);
		return "addPersonne";
	}
	
	
	@GetMapping("getAllPersonne")
	public String getAllPersonn(Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		List<Personne> p = personneRepository.findAll();
		System.out.println(p);
		model.addAttribute("personnes",p);
		return "allPersonnes";
	}
	
	
	@GetMapping("getPersonne/{num}")
	public String getPersonn(@PathVariable Long num, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		Personne p = personneRepository.findById(num).get();
		System.out.println(p);
		model.addAttribute("personne",p);
		return "showPersonne";
	}
	
	@GetMapping("getPersonneByName/{nom}")
	public String getPersonn(@PathVariable String nom, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		model.addAttribute("personnes",personneRepository.findByNomContaining(nom));
		return "allPersonnes";
	}
	
	
	
}
