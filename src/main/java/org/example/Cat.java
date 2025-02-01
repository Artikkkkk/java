package org.example;

import java.util.Date;

public class Cat {

     String name;
     int age;
     String sex;
     String address;
     Date dateOfBirth;

     public void eat(String food) {
          System.out.println("I am eating " + food);
     }

     public String getInfo() {
          StringBuilder sb = new StringBuilder();
          sb.append("Name: ");
          sb.append(name);
          sb.append("Age: ");
          sb.append(age);
          sb.append("Date of birth: ");
          sb.append(dateOfBirth);
          return sb.toString();
     }
}