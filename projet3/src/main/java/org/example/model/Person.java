

public class Person{
    private int id;
    private String nom;

    public Person(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void afficher(){
        System.out.println(id + " " + nom);
    }
}