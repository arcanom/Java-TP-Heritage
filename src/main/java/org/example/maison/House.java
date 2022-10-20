package org.example.maison;

import java.util.List;

public class House {
    private static int surface;
    protected static Door door;

    protected static Person person;


    public static void Display(){

        person.display();
        door.Display();
        System.out.println("Je suis une maison de " + surface + " m2"
        );
    }

    public House(int surface, Door door, Person person) {

        this.surface = surface;
        this.door = door;
        this.person = person;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }


}
