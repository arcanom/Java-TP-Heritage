package org.example.maison;

public class Person {
    String name;

    void display(){
        System.out.println("je suis " +  name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }


}
