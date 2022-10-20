package org.example.salarie;

public class Salarie {
    public String matricule;
    public String categorie ;
    public String service;
    public String nom;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int salaire;

    public void AfficherSalaire(){
        System.out.println("Le salaire de "  + nom +" est de " + salaire);
    }

    public Salarie(String matricule, String categorie, String service, String nom, int salaire) {
        this.matricule = matricule;
        this.categorie = categorie;
        this.service = service;
        this.nom = nom;
        this.salaire = salaire;
    }
}
