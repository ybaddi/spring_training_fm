package org.example.models;

import org.springframework.stereotype.Component;

@Component("voiture")
public class Car {

    public void start(){
        System.out.println("car started");
    }
}
