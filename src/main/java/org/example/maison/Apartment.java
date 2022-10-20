package org.example.maison;

public class Apartment extends House {

    public Apartment(int surface, Door door, Person person) {
        super(surface, door, person);
        surface = 50;
    }
}
