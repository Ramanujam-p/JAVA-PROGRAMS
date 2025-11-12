package week01;

import java.util.*;

public class Calcgrade {
    static String calculate(int marks) {
        if (marks > 90)
            return "O";
        else if (marks >= 80 && marks <= 89)
            return "A+";
        else if (marks >= 70 && marks <= 79)
            return "A";
        else if (marks >= 60 && marks <= 69)
            return "B+";
        else if (marks >= 50 && marks <= 59)
            return "B";
        else if (marks <= 49)
            return "U";
        else
            return "Invalid mark";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark:");
        int a = sc.nextInt();
        String b = calculate(a);
        System.out.println("Grade:" + b);
        sc.close();
    }
}
