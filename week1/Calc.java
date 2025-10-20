package week1;

import java.util.*;

public class Calc {
    public static void main(String[] args) {
        int a, b, c, r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.addition/n2.subtraction/3.multiplication/n4.division/n5.exit");
            System.out.println("enter the choice:");
            c = sc.nextInt();
            System.out.println("enter the numbers to perform calculations:");
            a = sc.nextInt();
            b = sc.nextInt();
            if (c == 1) {
                r = a + b;
                System.out.println("The additon of two numbers is:" + r);
            } else if (c == 2) {
                r = a - b;
                System.out.println("The subtraction of two numbers is:" + r);
            } else if (c == 3) {
                r = a * b;
                System.out.println("The multiplication of two numbers is:" + r);
            } else if (c == 4) {
                r = a / b;
                System.out.println("The division of two numbers is:" + r);
            } else if (c == 5) {
                System.out.println("code ended successfully");
            } else
                System.out.println("Invalid choice!enter the valid choice for further calculations");
        } while (c != 5);
        sc.close();
    }
}
