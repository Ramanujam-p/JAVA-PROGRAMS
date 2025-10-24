package week11;

interface Human {
    void run();// public abstract methods by default

    void read();

    static void write() {
        System.out.println("Human can write");// static methods can have a body
    }

    default void speak() {
        System.out.println("hello");// default methods can have a body
    }

    int x = 10;// public static final by default
}

class Person implements Human {
    public void run() {
        System.out.println("The Person can run");
    }

    public void read() {
        System.out.println("He is reading");
    }
}

public class interfaceBasic {

    public static void main(String[] args) {
        System.out.println("NAME:P.RAMANUJAM REG NO:2024503525");
        Person p = new Person();
        // Human h = new Human(); cannot instantiate or create the constructors for
        // interface
        System.out.println("The value of x is(access using interface name) :" + Human.x);
        System.out.println("The value of x is(access using object) :" + p.x);
        // p.write();Because write is static method of interface
        Human.write();// static method called using interface name
        p.speak();// default method called using object of implementing class
        p.run();
        p.read();

    }
}