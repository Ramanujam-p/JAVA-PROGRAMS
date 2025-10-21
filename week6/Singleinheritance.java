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

// Main class
public class Singleinheritance {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Animal a = new Animal();
        a.Breath(); // inherited from LivingBeing
        a.Response(); // inherited from LivingBeing
        a.Walk(); // own method
        a.NoOfLegs(4); // own method
    }
}
