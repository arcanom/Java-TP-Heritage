package org.example.maison;

public class Door {

    public String color;

    public void Display(){
        System.out.println("je suis une porte, ma couleur est" + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Door(String color) {
        this.color = color;
    }


}
