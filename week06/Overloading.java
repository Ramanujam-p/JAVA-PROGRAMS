package week06;

class Animal {
    void move() {
        System.out.println("The animal is moving");
    }

    void move(String direction) {
        System.out.println("The animal moves in the direction: " + direction);
    }

    void move(int distance) {
        System.out.println("The distance covered by the animal is: " + distance + " km");
    }

    void move(String direction, int distance) {
        System.out.println("The animal moves through " + direction + " at a distance: " + distance + " km");
    }
}

class Dog extends Animal {
    @Override
    void move() {
        System.out.println("The dog is moving");
    }

    void move(String direction) {
        System.out.println("The dog moves in the direction: " + direction);
    }

    void move(int distance) {
        System.out.println("The distance covered by the dog is: " + distance + " km");
    }

    void move(String direction, int distance) {
        System.out.println("The dog moves through " + direction + " at a distance: " + distance + " km");
    }
}

class Cat extends Animal {
    @Override
    void move() {
        System.out.println("The cat is moving");
    }

    void move(String direction) {
        System.out.println("The cat moves in the direction: " + direction);
    }

    void move(int distance) {
        System.out.println("The distance covered by the cat is: " + distance + " km");
    }

    void move(String direction, int distance) {
        System.out.println("The cat moves through " + direction + " at a distance: " + distance + " km");
    }
}

class Bird extends Animal {
    @Override
    void move() {
        System.out.println("The bird is flying");
    }

    void move(String direction) {
        System.out.println("The bird flies in the direction: " + direction);
    }

    void move(int distance) {
        System.out.println("The distance covered by the bird is: " + distance + " km");
    }

    void move(String direction, int distance) {
        System.out.println("The bird moves through " + direction + " at a distance: " + distance + " km");
    }
}

public class Overloading {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();

        // Individual calls
        d.move();
        d.move("east");
        d.move(5);
        d.move("east", 5);

        System.out.println("\nUsing polymorphism with Animal array:\n");

        Animal[] a = { d, c, b };
        for (Animal h : a) {
            h.move();
            h.move("south");
            h.move(5);
            h.move("south", 6);
            System.out.println();
        }
    }
}
