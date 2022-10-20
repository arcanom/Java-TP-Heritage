package org.example.commercial;

public class Adresse {
    public int numero;
    public String nomRue;
    public String zipCode;
    public String city;

    public Adresse(int numero, String nomRue, String zipCode, String city) {
        this.numero = numero;
        this.nomRue = nomRue;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", nomRue='" + nomRue + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
