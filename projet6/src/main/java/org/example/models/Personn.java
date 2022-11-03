package org.example.models;

public class Personn {

    private int id;
    private String nom;

    private Address address;

    public Personn(int id, String nom, Address address) {
        this.id = id;
        this.nom = nom;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

//    @Override
//    public String toString() {
//        return "Personn{" +
//                "id=" + id +
//                ", nom='" + nom + '\'' +
//                ", address=" + address +
//                '}';
//    }
}
