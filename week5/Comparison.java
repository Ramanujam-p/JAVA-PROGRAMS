package week5;

import java.util.Scanner;

public class Comparison {

    // Method to compare two version strings
    public static int compareVersions(String v1, String v2) {
        String[] arr1 = v1.split("\\.");
        String[] arr2 = v2.split("\\.");
        int len = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < len; i++) {
            int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int num2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            if (num1 > num2)
                return 1;
            if (num1 < num2)
                return -1;
        }

        return 0; // versions are equal
    }

    public static void main(String[] args) {
        System.out.println("NAME: RAMANUJAM.P");
        System.out.println("REG NO: 2024503525\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first version: ");
        String v1 = sc.nextLine();

        System.out.print("Enter second version: ");
        String v2 = sc.nextLine();

        int result = compareVersions(v1, v2);

        if (result > 0)
            System.out.println(v1 + " is greater than " + v2);
        else if (result < 0)
            System.out.println(v2 + " is greater than " + v1);
        else
            System.out.println(v1 + " and " + v2 + " are equal.");

        sc.close();
    }
}
