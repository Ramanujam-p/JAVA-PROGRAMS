package week11;

interface A {
    void show();
}

interface B extends A {
    void display();
}

class C implements B {
    public void show() {
        System.out.println("Show method from interface A");
    }

    public void display() {
        System.out.println("Display method from interface B");
    }
}

public class interfaceInheritance {
    public static void main(String[] args) {
        System.out.println("NAME:P.RAMANUJAM REG NO:2024503525");
        C obj = new C();
        obj.show();
        obj.display();
    }
}
