package week09;

import java.util.concurrent.*;

class Shared {
    static volatile int count = 1;
}

class Incrementer implements Runnable {
    private String name;
    private Semaphore s;

    Incrementer(Semaphore sem, String n) {
        name = n;
        s = sem;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting");
        System.out.println(name + " is waiting for permit");
        try {
            s.acquire();
            System.out.println(name + " acquired permit");
            for (int i = 1; i <= 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            s.release();
            System.out.println(name + " released permit");
        }
    }
}

class Decrementer implements Runnable {
    private String name;
    private Semaphore s;

    Decrementer(Semaphore sem, String n) {
        name = n;
        s = sem;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting");
        System.out.println(name + " is waiting for permit");
        try {
            s.acquire();
            System.out.println(name + " acquired permit");
            for (int i = 1; i <= 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            s.release();
            System.out.println(name + " released permit");
        }
    }
}

public class p4 {
    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM REG NO:2024503525");
        Semaphore sem = new Semaphore(1);
        Thread t1 = new Thread(new Incrementer(sem, "Thread 1"));
        Thread t2 = new Thread(new Decrementer(sem, "Thread 2"));

        t1.start();
        t2.start();
    }
}
