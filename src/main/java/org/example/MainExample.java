package org.example;

import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Calculator calculator = new Calculator();
//
//        System.out.println("Enter the first number: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter the operation: " );
//        String operation = sc.next();
//        System.out.println("Enter the second number: ");
//        double num2 = sc.nextDouble();
//
//        calculator.calculate(operation, num1, num2);

        Dog dog = new Dog();
        dog.woof();
        dog.say("Abra sjkfhsdfihweui f dsf ");
        dog.name = "Yowwi";
        dog.age = 2;
        dog.breed="rfdi";
        dog.ownerName="Dtru";
        dog.satiety=50;
        dog.info();

        dog.feed(12);
        dog.info();
    }
}
