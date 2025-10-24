package week04;

import java.util.*;

class Constructor {
    String name;
    int age;
    String address;

    // Default constructor
    Constructor() {
        this("Unknown");
    }

    // Constructor with one parameter
    Constructor(String name) {
        this(name, 0);
    }

    // Constructor with two parameters
    Constructor(String name, int age) {
        this(name, age, "Not Provided");
    }

    // Constructor with three parameters
    Constructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Display method
    void display() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();

        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter the address: ");
        String address = sc.nextLine();

        // Demonstrating constructor overloading and chaining
        Constructor a = new Constructor(); // default constructor
        Constructor b = new Constructor(name); // one-argument constructor
        Constructor c = new Constructor(name, age); // two-argument constructor
        Constructor d = new Constructor(name, age, address); // three-argument constructor

        a.display();
        b.display();
        c.display();
        d.display();

        sc.close();
    }
}
