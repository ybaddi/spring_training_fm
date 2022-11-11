package com.example.example15.dao;

import com.example.example15.model.Personne;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


import java.util.List;

@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne, Long> {

    @RestResource(path="nom")
    List<Personne> findByNomContains(@Param("nom") String nom,
                                     Pageable pageable);
    List<Personne> findByNom(@Param("nom") String nom);
}
