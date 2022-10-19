

public class Person{
    private int id;
    private String nom;
    private Address address;

    private List<String> loisirs;

    public Person(int id, String nom, Address address, List<String> loisirs) {
        this.id = id;
        this.nom = nom;
        this.address = address;
        this.loisirs = loisirs;
    }

    public void afficher(){
        System.out.println(id + " " + nom);
    }
}