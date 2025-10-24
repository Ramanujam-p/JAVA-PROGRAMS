package week08;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        // withour try catch
        double a = 5.0 / 0;
        System.out.println(a);
        // double b = 5 / 0;
        // System.out.println(b);
        // with try catch
        double c = 5.0 / 0;
        System.out.println(c);
        try {
            double d = 5 / 0;
            System.out.println("I am not executable");
        } catch (ArithmeticException e) {
            System.out.println("exception caught " + e);
        }
        try {
            int z = sc.nextInt();
        } catch (java.lang.Exception e1) {
            System.out.println("error:" + e1);
        }
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e2) {
            System.out.println("error:" + e2);
        }
        String str1 = "abc";
        try {
            int num = Integer.parseInt(str1); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: Can't convert a string to a number");
        } finally {
            System.out.println("hello");
        }
        sc.close();
    }
}
