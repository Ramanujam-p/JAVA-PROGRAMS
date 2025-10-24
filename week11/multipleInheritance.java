package week11;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A implementation");
    }

    public void methodB() {
        System.out.println("Method B implementation");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        System.out.println("NAME:P.RAMANUJAM REG NO:2024503525");
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
