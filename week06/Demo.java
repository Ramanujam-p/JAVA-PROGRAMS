package week06;

class Parent {
    public Number getValue() {
        return 10;
    }

    public void show() {
        System.out.println("Parent show()");
    }

    public void display() {
        System.out.println("Parent display()");
    }

    public Parent getObject() {
        System.out.println("Parent returning Parent");
        return this;
    }

    public void doWork(int x) {
        System.out.println("Parent doWork(int): " + x);
    }

    public static void staticMethod(int x) {
        System.out.println("Static in Parent with int: " + x);
    }
}

class Child extends Parent {
    @Override
    public Integer getValue() { // Covariant return type allowed
        return 42;
    }

    @Override
    public void show() {
        System.out.println("Child show()");
    }

    public void display(int x) { // Overloaded method
        System.out.println("Child display(int): " + x);
    }

    public void doWork(String msg) { // Overloaded method
        System.out.println("Child doWork(String): " + msg);
    }

    public static void staticMethod(String msg) { // Hides Parent staticMethod
        System.out.println("Static in Child with String: " + msg);
    }

    @Override
    public Child getObject() { // Covariant return type
        System.out.println("Child returning Child");
        return this;
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches ball");
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        // Polymorphism
        Parent p1 = new Child();
        p1.getObject(); // Calls Child.getObject() due to overriding

        Child child = new Child();
        child.doWork(100); // Calls Parent.doWork(int)
        child.doWork("Hello"); // Calls Child.doWork(String)

        Parent.staticMethod(10); // Calls Parent static method
        Child.staticMethod("Hi"); // Calls Child static method

        // Animal polymorphism
        Animal a = new Dog();
        a.speak(); // Calls Dog.speak() due to overriding
        Dog d = (Dog) a; // Downcasting
        d.fetch(); // Calls Dog.fetch()
    }
}
