package com.example.projet16.dao;

import com.example.projet16.model.Personne;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


import java.util.List;


public interface PersonneRepository extends JpaRepository<Personne, Long> {


    List<Personne> findByNomContains(@Param("nom") String nom,
                                     Pageable pageable);
    List<Personne> findByNom(@Param("nom") String nom);
}
