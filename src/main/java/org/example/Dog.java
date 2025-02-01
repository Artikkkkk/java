package org.example;

public class Dog {

   String name;
  int age;
   String breed;
   String ownerName;
   int satiety;
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void woof() {
        System.out.println("Woof");
    }

    public void say(String message) {
        System.out.println(message);
    }

    public void feed(int amount) {
        satiety = satiety + amount;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Owner: " + ownerName);
        System.out.println("Satiety: " + satiety);
    }
}