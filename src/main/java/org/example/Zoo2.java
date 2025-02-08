package org.example;

public class Zoo2 {

    public static void main(String[] agrs) {

        Zoo2 zoo2 = new Zoo2();
        zoo2.test();
    }

    public void test() {
        int a = 30;
        int b = 0;

        while (a > b) {
            b++;
            System.out.println(b);
            if (b > 3) {
                System.out.println("Hello");
            } else if (b >= 7) {
                System.out.println("Капуста");
            } else if (b > 20) {
                System.out.println("!!!");
            } else if (b == 27) {
                break;
            }
        }
    }
}