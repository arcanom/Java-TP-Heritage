package org.example.commercial.bookmanagement;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
    int id;
    String name;
    Author[] auteurs;
   Publisher editeur;

    public Publisher getEditeur() {
        return editeur;
    }

    public void setEditeur(Publisher editeur) {
        this.editeur = editeur;
    }

    int publishingAnnee;
    int amountOfPages;

    public int getPublishingAnnee() {
        return publishingAnnee;
    }

    public void setPublishingAnnee(int publishingAnnee) {
        this.publishingAnnee = publishingAnnee;
    }

    BigDecimal prix;
    CoverType coverType;

    public Book(int id, String name, Author[] auteurs, Publisher editeur, int publishingAnnee, int amountOfPages, BigDecimal prix, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.auteurs = auteurs;
        this.editeur = editeur;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        this.prix = prix;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteurs=" + Arrays.toString(auteurs) +
                ", editeur=" + editeur +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", prix=" + prix +
                ", coverType=" + coverType +
                '}';
    }
}
