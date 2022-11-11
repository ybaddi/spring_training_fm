package com.example.example15;

import com.example.example15.dao.PersonneRepository;
import com.example.example15.model.Address;
import com.example.example15.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Example15Application implements ApplicationRunner {

    @Autowired
    private PersonneRepository personneRepository;

    public static void main(String[] args) {

        SpringApplication.run(Example15Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Address adr = new Address("rabat","abtal","10053");
        Personne p1 = new Personne("baddi", "youssef", Arrays.asList(adr));
        Personne p2 = new Personne("baddi", "youssef", Arrays.asList(adr));
        Personne p3 = new Personne("baddi", "youssef", Arrays.asList(adr));
        Personne p4 = new Personne("baddi", "youssef", Arrays.asList(adr));
        Personne p5 = new Personne("baddi", "youssef", Arrays.asList(adr));

        personneRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    }

}
