package com.mycompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.model.Adress;
import com.mycompany.model.Personne;

public interface AdressRepository extends JpaRepository<Adress,Long>{
//CrudRepository<Personne,Long>{

}
