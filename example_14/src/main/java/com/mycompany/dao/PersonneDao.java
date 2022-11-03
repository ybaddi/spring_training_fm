package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Personne;

@Repository
public class PersonneDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	public int save(Personne p) {
//		return jdbcTemplate
//				.update("INSERT INTO Personne VALUES(?,?,?)",
//						p.getNum(), p.getNom(), p.getPrenom());
//	}
	
}
