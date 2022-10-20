package org.example.agence;

public class Epargne extends Compte implements  Creation{

    private float taux;
    private final float POURCENTAGE = 100;

    public float getTauxInteret() {
        return taux;
    }

    public void setTauxInteret(float tauxInteret) {
        this.taux = tauxInteret;
    }

    public Epargne(float solde, float taux) {
        super(solde);
        this.taux = taux;
    }



    public float calculInteret() {
        return this.solde =  solde * (1+taux/POURCENTAGE) ;
    }

    @Override
    public String toString() {
        return "Epargne{" +
                "taux=" + taux +
                ", POURCENTAGE=" + POURCENTAGE +
                ", solde=" + solde +
                '}' + super.toString();
    }

    @Override
    public void creationInfo() {
        System.out.println("Je viens d'etre crée et je suis un compte Epargne");
    }
}
