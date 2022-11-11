package com.example.projet16.dao;

import com.example.projet16.model.Personne;
import com.example.projet16.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {



    User findByUsername(String username);
}
