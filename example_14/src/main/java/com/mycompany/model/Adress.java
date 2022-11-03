package com.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rue;
	private String codePostal;
	private String ville;
	public Adress() {
		super();
	}
	public Adress(String rue, String codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	public Adress(Long id, String rue, String codePostal, String ville) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Adress [id=" + id + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

	
	
}
