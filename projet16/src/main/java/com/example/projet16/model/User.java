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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
//    @NonNull
    private String username;
//    @NonNull
    private String password;

//    @NonNull
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;
}
