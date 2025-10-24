package week02;

import java.util.Scanner;

public class LoginFailureCounter {
    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:P.RAMANUJAM");
        String name = "admin";
        String pass = "Rama";
        Scanner scanner = new Scanner(System.in);
        int failCount = 0;

        while (true) {
            System.out.print("Enter username (or type 'exit' to quit): ");
            String username = scanner.nextLine();

            if (username.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check if username and password match
            if (username.equals(name) && password.equals(pass)) {
                System.out.println("Login successful.");
            } else {
                failCount++;
                System.out.println("Login failed. Fail count: " + failCount);
            }
        }

        scanner.close();
        System.out.println("Program ended. Total non-admin login failures: " + failCount);
    }
}
