package week9;

import java.util.concurrent.*;

class A implements Runnable {
    String name;
    Semaphore s;

    A(Semaphore sem, String n) {
        name = n;
        s = sem;
    }

    @Override
    public void run() {
        System.out.println(name + " is staring");
        System.out.println(name + " is waiting for permit");
        try {
            s.acquire();
            System.out.println(name + " acquired permit");
            for (int i = 1; i <= 5; i++) {
                shared.count++;
                System.out.println(name + ":" + shared.count);
                Thread.sleep(1000);
            }
            s.release();
            System.out.println(" released permit");
        } catch (InterruptedException e1) {
            System.out.println(e1);
        }
    }
}

class B implements Runnable {
    String name;
    Semaphore s;

    B(Semaphore sem, String n) {
        name = n;
        s = sem;
    }

    @Override
    public void run() {
        System.out.println(name + " is staring");
        System.out.println(name + " is waiting for permit");
        try {
            s.acquire();
            System.out.println(name + " acquired permit");
            for (int i = 1; i <= 5; i++) {
                shared.count--;
                System.out.println(name + ":" + shared.count);
                Thread.sleep(1000);
            }
            s.release();
            System.out.println(" released permit");
        } catch (InterruptedException e1) {
            System.out.println(e1);
        }
    }
}

class shared {
    static int count = 1;
}

public class p4 {
    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        Semaphore s = new Semaphore(1);
        A a = new A(s, "thread 1");
        B b = new B(s, "thread 2");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}