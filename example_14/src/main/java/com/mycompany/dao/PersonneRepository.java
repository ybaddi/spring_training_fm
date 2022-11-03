package com.mycompany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.mycompany.model.Personne;

public interface PersonneRepository extends 
//   CrudRepository<Personne,Long>{
//PagingAndSortingRepository<Personne,Long>{
JpaRepository<Personne,Long>{
      List<Personne> findByNom(String Nom);
      List<Personne> findByNomContaining(String Nom);
      List<Personne> findByPrenom(String Prenom);
      
      List<Personne> findByNomContainingAndPrenomContaining(String nom,String prenom);
//      @Query("select * from Personne where nom=:nom")
//      List<Personne> getByNom(@Param("nom") String nom);
}
