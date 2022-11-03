package org.example.language;

import org.springframework.stereotype.Component;

@Component
public class SalutationFr implements Salutation{
    public void sayHello(){
        System.out.println("in frensh we say Bonjour");
    }
}
