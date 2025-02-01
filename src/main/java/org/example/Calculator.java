package org.example;

public class Calculator {

    double result;

    // + - * /

    public void calculate(String operation, double num1, double num2) {
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        }else if (operation.equals("/")) {
           result = num1 / num2;
        }
        else {
            System.out.println("Invalid operation. Valid operation [ +, -, *, / ]");
            return;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
