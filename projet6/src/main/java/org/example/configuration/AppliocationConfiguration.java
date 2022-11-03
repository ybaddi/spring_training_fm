package org.example.configuration;

import org.example.models.Address;
import org.example.models.Personn;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value="org.example.nation,org.example.language")
public class AppliocationConfiguration {

    @Bean
    @Scope("prototype")
    public Personn per(Address addr){
        Personn personne = new Personn(1,"baddi", addr);
        return personne;
    }

    @Bean
    public Address addr(){
        Address address = new Address("abtale","1005", "Rabat");
        return address;
    }
}
