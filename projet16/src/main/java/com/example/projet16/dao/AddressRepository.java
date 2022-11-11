package com.example.projet16.dao;


import com.example.projet16.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface AddressRepository extends JpaRepository<Address, Long> {

}
