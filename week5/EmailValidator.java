package week5;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println("NAME: RAMANUJAM.P");
        System.out.println("REG NO: 2024503525\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Email is valid.");
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Email is invalid.");
        }

        sc.close();
    }

    public static boolean isValidEmail(String email) {
        // Check for exactly one '@' symbol
        int atCount = email.length() - email.replace("@", "").length();
        if (atCount != 1) {
            return false;
        }

        String[] parts = email.split("@");
        if (parts.length != 2)
            return false;

        String username = parts[0];
        String domain = parts[1];

        // Validate username
        if (username.length() == 0 || username.length() > 25)
            return false;
        if (!username.matches("[a-zA-Z0-9_\\-+]+"))
            return false;

        // Validate domain ending
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            return false;
        }

        // Validate domain name before the last dot
        String domainName = domain.substring(0, domain.lastIndexOf('.'));
        if (domainName.length() < 1 || !domainName.matches("[a-zA-Z0-9\\-]+")) {
            return false;
        }

        return true;
    }
}
