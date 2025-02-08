package org.example;

public class Cow {

    String name;
    int age;
    String breed;
    String ownerName;
    int data;
    String placeOfResiden;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mooo() {
        System.out.println("mooo");
    }

    public void cow() {
        System.out.println("cow");
    }

    public void info() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Breed" + breed);
        System.out.println("OwnerName" + ownerName);
        System.out.println("Data" + data);

    }
}