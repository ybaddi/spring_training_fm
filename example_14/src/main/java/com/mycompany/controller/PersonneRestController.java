package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.dao.AdressRepository;
import com.mycompany.dao.PersonneDao;
import com.mycompany.dao.PersonneRepository;
import com.mycompany.model.Adress;
import com.mycompany.model.Personne;

@RestController
public class PersonneRestController {

	@Autowired
//	private PersonneDao personneDao;
	private PersonneRepository personneRepository;
	
	@Autowired
	private AdressRepository adressRepository;
	
	@GetMapping("addPersonneAPI")
	public String addPersonne(){
		return "addPersonne";
	}
	
	
	
	@PostMapping("addPersonneAPI")
	public Personne addPersonnAPI(@RequestBody Personne personne){
//		Personne p = new Personne(nom,prenom);
		System.out.println(personne);
//		model.addAttribute("nom", nom);
//		model.addAttribute("prenom",prenom);
		return personneRepository.save(personne);
	}
	
	@PostMapping("addPersonneAPIExtend")
	public Personne addPersonneAPIExtend(@RequestBody Personne personne){
//		Personne p = new Personne(nom,prenom);
		
		List<Adress> adresses = personne.getAdresses();
		for(Adress adr: adresses) {
			Adress newAdress = null;
			if(adr.getId() !=null) {
				newAdress = adressRepository.findById(adr.getId()).orElse(null);
				adresses.set(adresses.indexOf(adr), newAdress);
			} else {
			newAdress = adressRepository.save(adr);
			}
		}
		
//		System.out.println(personne);
////		model.addAttribute("nom", nom);
////		model.addAttribute("prenom",prenom);
		return personneRepository.saveAndFlush(personne);
	}
	
	@PutMapping("updatePersonneAPI")
	public Personne updatePersonnAPI(@RequestBody Personne personne){
//		Personne p = new Personne(nom,prenom);
		System.out.println(personne);
//		model.addAttribute("nom", nom);
//		model.addAttribute("prenom",prenom);
		return personneRepository.save(personne);
	}
	
	@DeleteMapping("delPersonneAPI")
	public void delPersonnAPI(@RequestBody Personne personne){
//		Personne p = new Personne(nom,prenom);
		System.out.println(personne);
//		model.addAttribute("nom", nom);
//		model.addAttribute("prenom",prenom);
		personneRepository.delete(personne);
	}
	
	@GetMapping("getPersonneAPI/{num}")
	public String getPersonn(@PathVariable Long num, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		Personne p = personneRepository.findById(num).get();
		System.out.println(p);
		model.addAttribute("personne",p);
		return "showPersonne";
	}
	
	@GetMapping("getPersonneByNameAPI/{nom}")
	public String getPersonn(@PathVariable String nom, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		model.addAttribute("personnes",personneRepository.findByNomContaining(nom));
		return "allPersonnes";
	}
	
	

	@GetMapping(value="getAllPersonneAPI", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<Personne> getPersonnAPI(Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
//		System.out.println(p);
//		model.addAttribute("personnes",personneRepository.findAll());
		return personneRepository.findAll();
	}
}
