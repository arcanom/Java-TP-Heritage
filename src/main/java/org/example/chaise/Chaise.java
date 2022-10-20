package org.example.chaise;

public class Chaise {

    protected  int nbPieds;
    protected String  couleur;
    protected String Materieau;

    public Chaise(int nbPieds, String couleur, String materieau) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.Materieau = materieau;
    }

    public Chaise(){

    };

    @Override
    public String toString() {
        return "Je suis une Chaise, avec " + nbPieds +
                "pieds en '" + Materieau+ '\'' +
                "et de couleur'" + couleur + '\'' +
                '}';
    }
}
