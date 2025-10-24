package week02;

import java.util.Scanner;

public class VaccineEligibility {
    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:P.RAMANUJAM");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient's age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("Eligible for vaccination.");

            System.out.print("Enter 3-digit appointment number: ");
            int appointment = scanner.nextInt();

            if (appointment >= 100 && appointment <= 999) {

                // Check if appointment number is even
                if (appointment % 2 == 0) {
                    System.out.println("Assigned to Priority Slot.");
                } else {
                    System.out.println("Assigned to Regular Slot.");
                }

                // Gift selection based on last digit
                int lastDigit = appointment % 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("Gift: Pen");
                        break;
                    case 2:
                        System.out.println("Gift: Mask");
                        break;
                    case 3:
                        System.out.println("Gift: Sanitizer");
                        break;
                    default:
                        System.out.println("No special gift.");
                }

            } else {
                System.out.println("Invalid appointment number. Must be a 3-digit number.");
            }

        } else {
            System.out.println("Not eligible for vaccination.");
        }

        scanner.close();
    }
}
