package com.example.example_spring_boot_1.dao;

import com.example.example_spring_boot_1.model.Adresse;
import com.example.example_spring_boot_1.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
