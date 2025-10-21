package week6;

// Base class
class LivingBeing {
    void Breath() {
        System.out.println("The living being can breathe");
    }

    void Response() {
        System.out.println("It can respond");
    }
}

// Derived class
class Animal extends LivingBeing {
    Animal() {
        System.out.println("I am an animal");
    }

    void Walk() {
        System.out.println("It can walk");
    }

    void NoOfLegs(int L) {
        System.out.println("The number of legs in this animal: " + L);
    }
}

// Further derived class
class Cat extends Animal {
    void Meow() {
        System.out.println("It sounds like meow meow");
    }
}

// Further derived class
class Dog extends Cat {
    void Bark() {
        System.out.println("It can bark");
    }
}

// Main class
public class Multilevelinheritance {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Dog d = new Dog();

        // Dog's own method
        d.Bark();

        // Inherited from Cat
        d.Meow();

        // Inherited from Animal
        d.Walk();
        d.NoOfLegs(4);

        // Inherited from LivingBeing
        d.Breath();
        d.Response();
    }
}
