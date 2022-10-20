package org.example.commercial.bookmanagement;

import java.util.ArrayList;
import java.util.List;

public   class BookService {
    public  static List<Book> filterBooksByAuthor(Author auteur, Book[] livres ){
        List<Book> filteredBook = new ArrayList<Book>();
        System.out.println(livres.length);
        for(int i=0;i<livres.length;i++){
            for(int j=0;j<livres[i].auteurs.length;j++)
            if(livres[i].auteurs[j].getLastname().equals(auteur.getLastname()) && livres[i].auteurs[j].getFirstName().equals(auteur.getFirstName())) {
                   filteredBook.add(livres[i]);

            }
        }
        return filteredBook;
    }

    public static List<Book> filterBooksByPublisher(Publisher editeur, Book[] livres){
        List<Book> filteredBook = new ArrayList<Book>();
        for(int i =0;i< livres.length;i++){
            if(livres[i].editeur.getPublisherName().equals(editeur.getPublisherName())){
                filteredBook.add(livres[i]);
            }
        }
        return  filteredBook;
    }

    public static List<Book> filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] livres){
        List<Book> filteredBook = new ArrayList<Book>();
        for(int i =0;i< livres.length;i++){
            int publisingAnnee =  livres[i].getPublishingAnnee();
            if (publisingAnnee == yearFromInclusively){
                filteredBook.add(livres[i]);
            }
        }
        return filteredBook;
    }




}
