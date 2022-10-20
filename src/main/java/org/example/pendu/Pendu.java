package org.example.pendu;

import java.util.Scanner;

public class Pendu {

    public static  int NbEssai = 0;
    public  static String Masque="";
    public static String MotATrouver;

public static void NombreEssai(int propo){
    NbEssai = propo;
}
    public static void TestChar(String propo) {
        String Masque2 =  Masque;
        for (int i = 0; i < MotATrouver.length(); i++) {
            char lettre = MotATrouver.charAt(i);

            String testLettre = String.valueOf(lettre);
            if (testLettre.equals(propo)) {

                Masque = Masque.substring(0, i) + propo
                        + Masque.substring(i + 1);
            }

        }
        if(Masque.equals(Masque2)){
            NbEssai--;
            System.out.println("----- Le jeu du pendu ------");
            System.out.println("le mot à  trouver: " + Masque);
            System.out.println("Il vous reste " + NbEssai + " essais");
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une lettre");
        }
        else {
            System.out.println("----- Le jeu du pendu ------");
            System.out.println("le mot à  trouver: " + Masque);
            System.out.println("Il vous reste " + NbEssai + " essais");
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une lettre");
        }
    }
    public static  boolean TestWin(){
        if(MotATrouver.equals(Masque)){
            return true;
        } else {
            return false;
        }

    }

    public static void GenererMasque(){
        for (int i=0;i< MotATrouver.length();i++){
            Masque =  "*" + Masque;
        }
    }

    public static void Main(){
        MotATrouver = GenerateurDeMot.generer();
        Scanner sc = new Scanner(System.in);

        GenererMasque();
        System.out.println("----- Le jeu du pendu ------");
        System.out.println("Combien voulez vous d'essai");
        int essai = sc.nextInt();
        NombreEssai(essai);
        System.out.println("le mot à  trouver: " + Masque);
        System.out.println("Il vous reste " + NbEssai + " essais");

        System.out.println("Veuillez saisir une lettre");

        while( TestWin() ==  false && NbEssai > 0 ){
            String propo = sc.next();
            TestChar(propo);

        }
        if(TestWin()){
            System.out.println("Bravo! vous avez gagné");
            System.out.println("Le mot a trouvé1 était " + MotATrouver);
        }
        if(NbEssai == 0){
            System.out.println("Vous avez perdu !");
            System.out.println("Le mot a trouvé était " + MotATrouver);
        }

    }

}
