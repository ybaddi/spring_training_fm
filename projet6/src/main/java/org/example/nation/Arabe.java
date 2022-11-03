package org.example.nation;

import org.springframework.stereotype.Component;


public class Arabe implements European{
    @Override
    public void saluer() {
        System.out.println("salam");
    }
}
