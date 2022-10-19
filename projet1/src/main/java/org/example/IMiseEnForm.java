package org.example;

@FunctionalInterface
public interface IMiseEnForm {

    public void afficherDetails();

    default void afficherNomComplet(){
        System.out.println("nom complet");
    }
}
