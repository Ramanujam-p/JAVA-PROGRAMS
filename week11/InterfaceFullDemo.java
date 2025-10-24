package week11;

// Marker Interface (no methods)
interface Identifiable {
}

// Functional Interface (only one abstract method)
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

// Base interface with static, default, private methods, and constants
interface Human {
    int MAX_AGE = 120; // public static final by default

    void run(); // abstract method

    void read(); // abstract method

    static void write() { // static method
        System.out.println("Human can write");
    }

    default void speak() { // default method
        privateHelper(); // call private method
        System.out.println("Hello from Human interface");
    }

    // Private method (Java 9+)
    private void privateHelper() {
        System.out.println("Private helper inside Human interface");
    }
}

// Another interface
interface Employee {
    void work();

    default void speak() { // default method with same name as Human
        System.out.println("Speaking as Employee");
    }
}

// Interface extending multiple interfaces
interface Manager extends Human, Employee {
    void manage();

    @Override
    default void speak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }
}

// Class implementing multiple interfaces and resolving default method conflicts
class Person implements Manager, Identifiable {
    public void run() {
        System.out.println("Person is running");
    }

    public void read() {
        System.out.println("Person is reading");
    }

    public void work() {
        System.out.println("Person is working");
    }

    public void manage() {
        System.out.println("Person is managing tasks");
    }

    // Resolve default method conflict
    public void speak() {
        Manager.super.speak(); // Use the most specific super type
        System.out.println("Person speaking"); // Add custom implementation
    }
}

// Main class to test everything
public class InterfaceFullDemo {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM REG NO:2024503525");

        // Interface reference (polymorphism)
        Human h = new Person();
        h.run();
        h.read();
        h.speak(); // calls overridden method resolving default conflict

        // Static method
        Human.write();

        // Access constant
        System.out.println("Max age: " + Human.MAX_AGE);

        // Functional interface with lambda
        Calculator calc = (a, b) -> a + b;
        System.out.println("Sum using lambda: " + calc.add(10, 20));

        // Multiple interface reference
        Employee e = new Person();
        e.work();

        // Marker interface (type check)
        if (h instanceof Identifiable) {
            System.out.println("Person is Identifiable");
        }

        // Using Manager interface
        Manager m = new Person();
        m.manage();
        m.speak();
    }
}
