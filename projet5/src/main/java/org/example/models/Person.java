package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {


    @Autowired @Qualifier("voiture")
    Car car;

    public void drive(){
        System.out.println("driving");
        car.start();
    }
}
