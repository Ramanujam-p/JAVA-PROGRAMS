package week1;

public class Static {
    static int a;
    static {
        System.out.println("Static block executed");
        a = 10;
    }

    static void method() {
        System.out.println("Static method");
    }

    Static() {
        System.out.println("Constructor executed");
    }

    void display() {
        System.out.println("Non static method");
    }

    public static void main(String[] args) {
        System.out.println(a);
        method();
        Static s = new Static();
        s.display();
    }
}
