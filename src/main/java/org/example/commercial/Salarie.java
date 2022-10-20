package org.example.commercial;

public class Salarie {
    public String matricule;
    public String categorie ;
    public String service;
    public String nom;
    public float salaire;
    public int compteur = 0;

    public Salarie(String nom, float salaire) {
        this.nom = nom;
        this.salaire = salaire;
        ++compteur;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public Salarie(String matricule, String categorie, String service, String nom, float salaire) {
        this.matricule = matricule;
        this.categorie = categorie;
        this.service = service;
        this.nom = nom;
        this.salaire = salaire;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }


    public static int somme(float ... floats){
        int somme = 0;
        for(float i : floats){
            somme += i;
        }
        return somme;
    }

    public void AfficherSalaire(){
        System.out.println("Le salaire de "  + nom +" est de " + salaire);
    }


}