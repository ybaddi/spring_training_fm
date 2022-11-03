package org.example.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationEn implements Salutation{
    public void sayHello(){
        System.out.println("in engish we say Hello");
    }
}

// @Controller, RestController
// @Service

// @Repository
