package week6;

// Base class
class LivingBeing {
    LivingBeing(String name) {
        System.out.println("The name of the living being is: " + name);
    }

    void breathe() {
        System.out.println("It can breathe");
    }

    void response() {
        System.out.println("It can respond");
    }
}

// Derived class 1
class LandAnimal extends LivingBeing {
    LandAnimal(String name) {
        super(name);
    }

    void walk() {
        System.out.println("The land animal can walk");
    }

    void NumberofLegs(int L) {
        System.out.println("The number of legs in Land animal: " + L);
    }
}

// Derived class 2
class WaterAnimal extends LivingBeing {
    WaterAnimal(String name) {
        super(name);
    }

    void swim() {
        System.out.println("It can swim");
    }

    void watertype() {
        System.out.println("The type of water is fresh");
    }
}

// Dog class inherits from LandAnimal
class Dogs extends LandAnimal {
    Dogs(String name) {
        super(name);
    }

    void bark() {
        System.out.println("The dog is barking");
    }
}

// Cat class inherits from LandAnimal
class Cats extends LandAnimal {
    Cats(String name) {
        super(name);
    }

    void meow() {
        System.out.println("Meow Meow");
    }
}

// Main class
public class Hi {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Dogs d = new Dogs("Buddy");
        d.breathe();
        d.response();
        d.walk();
        d.NumberofLegs(4);
        d.bark();

        System.out.println();

        Cats c = new Cats("Kitty");
        c.breathe();
        c.response();
        c.walk();
        c.NumberofLegs(4);
        c.meow();
    }
}
