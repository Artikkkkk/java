package org.example;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Integer> listOfIntegers = new ArrayList<>();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.test();
    }


    public void test() {
        int a = 10;
        int b = 0;

 //       for (int i = 0; i <= 110; i++) {
  //          System.out.println(i);
  //      }

        while (a > b) {
            b++;
            System.out.println(b);
            if (b == 1) {
                System.out.println("One");
            }
            else if (b == 2) {
                System.out.println("Cat");
            }
            else if (b == 3) {
                System.out.println("IIII");
            }
            else if (b == 6) {
                break;
            }
            else {
                System.out.println("ELSE");
            }
        }
    }

}
