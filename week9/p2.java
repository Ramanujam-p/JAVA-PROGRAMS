package week9;

class A implements Runnable {
    @Override
    public void run() {
        System.out.println("I am class A");
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("I am class B");
    }
}

public class p2 {
    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}