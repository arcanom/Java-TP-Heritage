package org.example.commercial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    static  List<Salarie>  listSalaires = new ArrayList<Salarie>();
    public static void init(){
        Salarie salarie1 =  new Salarie("Robert",3000);
        Salarie salarie2 =  new Salarie("Michel",5);
        Commercial commercial1 =  new Commercial("Ludovic",1500,5);
        Commercial commercial2 =  new Commercial("Constance",4000,5);

        listSalaires.add(salarie1);
        listSalaires.add(salarie2);
        listSalaires.add(commercial1);
        listSalaires.add(commercial2);
    }

    public static void MenuGestion(){


        System.out.println("=====  Gestion des employès =====");
        System.out.println("");
        System.out.println("1 -- Ajouter un employé");
        System.out.println("2-- Afficher le salaire des employès ");
        System.out.println("3-- Rechercher un employé");
        System.out.println("0-- Quitter");

        System.out.println("");
        System.out.println("Entrez votre choix :");
        Scanner sc = new Scanner(System.in);
        int choix =  sc.nextInt();
        while(choix != 0){
            switch(choix){
                case 1:
                    addEmployes();
                    break;
                case 2:
                    showSalaire();

                    break;
                case 3:
                    searchEmployes();

                    break;
                case 0 :
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix indisponible");
                    break;
            }
            choix =  sc.nextInt();
        }
    }

    public static void addEmployes(){
        System.out.println("=====  Ajouter un employé =====");
        System.out.println("");
        System.out.println("1 - Salarié");
        System.out.println("2 - Commercial");
        System.out.println("0 - Retour");
        System.out.println("");
        System.out.println("Entrez votre choix");
        Scanner sc = new Scanner(System.in);
        int choix1 = sc.nextInt();

            switch(choix1){
                case 1:
                    addSalarie();

                    break;
                case 2:
                    addCommercial();

                    break;
                case 0:
                    MenuGestion();
                    break;
                default:
                    System.out.println("saisie impossible, veuillez ressayer");
                    break;
            }
        choix1 = sc.nextInt();
    }

    public static void addSalarie(){
        System.out.println(" ----- Ajout d'un salarié -----");
        System.out.println("");
        System.out.println("Entrez un nom");
        Scanner sc = new Scanner(System.in);
        String nom =  sc.next();
        System.out.println("Entrez un matricule");
        String matricule =  sc.next();
        System.out.println("Entrez une catégorie");
        String categorie = sc.next();
        System.out.println("Entrez un service");
        String service = sc.next();
        System.out.println("Entrez un salaire");
        float salaire = sc.nextFloat();

        Salarie addSalarie = new Salarie(matricule, categorie,service,nom,salaire) ;
        listSalaires.add(addSalarie);
        System.out.println(addSalarie);

        addEmployes();
    }

    public static void addCommercial(){
        System.out.println(" ----- Ajout d'un commercial -----");
        System.out.println("");
        System.out.println("Entrez un nom");
        Scanner sc = new Scanner(System.in);
        String nom =  sc.next();
        System.out.println("Entrez un matricule");
        String matricule =  sc.next();
        System.out.println("Entrez une catégorie");
        String categorie = sc.next();
        System.out.println("Entrez un service");
        String service = sc.next();
        System.out.println("Entrez un salaire");
        float salaire = sc.nextFloat();
        System.out.println("Entrez un chiffre d'affaires");
        float chiffre = sc.nextFloat();
        System.out.println("Entrez une commission");
        int commission = sc.nextInt();

        Commercial addCommercial =  new Commercial(matricule,categorie,service,nom,salaire,chiffre,commission);
        listSalaires.add(addCommercial);
        System.out.println(addCommercial);

        addEmployes();
    }
    public static void showSalaire(){
        System.out.println("===== Salaire des employés =====");
        System.out.println("");

        for (Salarie salaries : listSalaires){
            salaries.AfficherSalaire();
        }
        MenuGestion();
    }

    public  static void searchEmployes(){
        boolean notFound = false;
        System.out.println("====== Recherche employé par nom======");
        System.out.println("");
        System.out.println("Entrez un nom");
        Scanner sc = new Scanner(System.in);
        String nom =  sc.next();

        for(Salarie salaries : listSalaires){
            if(salaries.nom.equals(nom)){
                notFound =  false;
                salaries.AfficherSalaire();
            } else{
                notFound  = true;
            }
        }
        if(notFound){
            System.out.println("Aucun salarié trouvé");
        }
        MenuGestion();
    }
}
