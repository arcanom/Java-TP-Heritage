package org.example.salarie;

import java.util.List;
import java.util.Scanner;

public class Application {
     static Salarie salarie;
    public static int montantTotal;
    public static int nbSalarie;

    public static  int nbSalaries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Le nombre de salaries");
        int salaries =  sc.nextInt();
        return salaries;
    }

    public static void Main(){
       nbSalarie =  nbSalaries();
        for(int i =0;i<nbSalarie;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nom du salarié");
            String nom = sc.nextLine();
            System.out.println("Salaire du salarié");
            int salaire = sc.nextInt();

            montantTotal +=  salaire;

            salarie = new Salarie("hyuiy","yubfefchue","rvebvhrebh",nom,salaire);
            salarie.AfficherSalaire();

        }
        System.out.println("Le montant total des salaires mensuel est de " + montantTotal);


    }

}
