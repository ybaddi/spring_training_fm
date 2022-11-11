package com.example.projet16.model;

//import lombok.*;


import javax.persistence.*;
import java.util.List;

//@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@RequiredArgsConstructor
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
//    @NonNull
    private String nom;
//    @NonNull
    private String prenom;

//    @NonNull
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;
}
