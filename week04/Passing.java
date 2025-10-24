package week04;

import java.util.*;

class Passing {
    String name;
    int age;
    String address;

    // Method to set values
    void set(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method returning current object
    Passing get() {
        return this;
    }

    // Method to display details
    void display(Passing obj) {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Address: " + obj.address);
    }

    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();

        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter the address: ");
        String address = sc.nextLine();

        Passing a = new Passing();
        Passing b = new Passing();
        Passing c = new Passing();

        a.set(name, age, address);
        System.out.println("\nDisplaying using object 'b' (passing object 'a'):");
        b.display(a);

        c = a.get(); // returns object 'a'
        System.out.println("\nDisplaying using object 'b' (passing object 'c'):");
        b.display(c);

        sc.close();
    }
}
