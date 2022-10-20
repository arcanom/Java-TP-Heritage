package org.example.pendu;

public class GenerateurDeMot {

    public static String[] mots = {"pantoufle","chien","banane","cochon", "velo","bagarre","orange","delice","bateaux","java","amazon","parasite","colerique","debile"};
    protected static String generer(){
        int rand = (int) Math.floor(Math.random()* mots.length);
        return mots[rand];
    }
}
