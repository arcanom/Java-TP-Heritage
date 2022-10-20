package org.example;

import org.example.agence.*;
import org.example.chaise.Chaise;
import org.example.classe.Student;
import org.example.classe.Teacher;
import org.example.commercial.Start;
import org.example.maison.Apartment;
import org.example.maison.Door;
import org.example.maison.House;
import org.example.maison.Person;
import org.example.pendu.Pendu;
import org.example.salarie.Application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Simple compteSimple =  new Simple(1000,-50);
//        Epargne compteEpargne = new Epargne(2000,6);
//        Epargne compteEpargne2 = new Epargne(2000,6);
//        Payant comptePayant =  new Payant(3000);

//        System.out.println(comptePayant);
//        System.out.println(compteEpargne);
//        System.out.println(compteSimple);
//
//        comptePayant.verser(500);


//        List<Compte> liste = new ArrayList<Compte>();
//        List<Creation> liste2 = new ArrayList<>();
//
//
//
//        liste.add(compteEpargne);
//        liste.add(compteEpargne2);
//        liste.add(compteSimple);
//        liste.add(comptePayant);
//
//        liste2.add(compteEpargne);
//        liste2.add(compteEpargne2);
//        liste2.add(compteSimple);
//        liste2.add(comptePayant);


//        for(Compte c: liste){
//            if( c instanceof  Epargne){
//                System.out.println("Je suis une instance de compte Epargne");
//            } else if( c instanceof  Payant){
//                System.out.println("Je suis une instance de compte Payant");
//            } else if(c instanceof  Simple){
//
//                System.out.println("Je suis une instance de compte Simple");
//            }
//        }
//
//        for(Creation c : liste2){
//            c.creationInfo();
//        }


//        Chaise bois = new Chaise(4,"bleu","bois");
//        Chaise metal = new Chaise(4,"blanche","metal");
//        Chaise pléxiglass = new Chaise(1,"transparente","plexiglass");
//
//        System.out.println("Affichage d'un nouvel objet");
//        System.out.println(bois.toString());
//
//        System.out.println("Affichage d'un nouvel objet");
//        System.out.println(metal.toString());
//
//        System.out.println("Affichage d'un nouvel objet");
//        System.out.println(pléxiglass.toString());


//        Pendu.Main();

//        Person person = new Person();
//        person.hello();
//
//        Student student =  new Student();
//        student.hello();
//        student.GoToClasses();
//       int age = student.SetAge(15);
//        student.DisplayAge(age);
//
//        Teacher teacher = new Teacher();
//        teacher.hello();
//        int age2 = student.SetAge(40);
//        teacher.Explain();

//        Door door= new Door("bleu");
//        Person perso = new Person("Thomas");
//        Apartment maison = new Apartment(50, door,perso);
//
//
//       maison.Display();

//        Application.Main();

        Start.init();
        Start.MenuGestion();
    }
}