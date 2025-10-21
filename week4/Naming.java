package week4;

import java.util.Scanner;

class Naming {
    String name;
    int age;

    // Parameterized constructor
    Naming(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print details
    void print() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();

        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();

        Naming obj = new Naming(name, age);
        obj.print();

        sc.close();
    }
}
