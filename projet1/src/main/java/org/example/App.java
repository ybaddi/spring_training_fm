package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Personn p = new Personn("baddi", "youssef", 26);
        p.iMiseEnForm.afficherDetails();
        System.out.println(p.iMiseEnForm);
        System.out.println(p.iMiseEnForm_2);
        p.iMiseEnForm.afficherNomComplet();
        p.iCalcul.somme(3,4);
        System.out.println(p.iMiseEnForm.getClass().getSuperclass());
    }
}
