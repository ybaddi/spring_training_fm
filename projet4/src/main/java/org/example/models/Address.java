package org.example.models;

public class Address {

    private String rue;
    private String codeP;
    private String ville;


    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Address{" +
                "rue='" + rue + '\'' +
                ", codeP='" + codeP + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
