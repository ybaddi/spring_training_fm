package com.example.projet16.model;

//import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

//@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@RequiredArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
//    @NonNull
    private String vile;
//    @NonNull
    private String rue;
//    @NonNull
    private String codePostal;


    @RestResource(exported = true)
    @ManyToMany(mappedBy = "addresses")
    private List<Personne> personne;
}
