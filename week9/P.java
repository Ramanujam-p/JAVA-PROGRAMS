package week9;

import java.util.concurrent.*;

class C implements Runnable {
    private String n;
    private Semaphore s;

    C(Semaphore sem, String name) {
        n = name;
        s = sem;
    }

    @Override
    public void run() {
        System.out.println(n + " arriving at lot.");
        try {
            System.out.println(n + " waiting for slot...");
            s.acquire();
            System.out.println(n + " parked.");
            Thread.sleep(2000); // Simulate parking time
            System.out.println(n + " leaving lot.");
            s.release();
        } catch (InterruptedException e) {
            System.out.println(n + " interrupted.");
        }
    }
}

public class P {
    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM   REG NO: 2024503525");

        Semaphore s = new Semaphore(2); // 2 parking slots

        String[] names = { "A", "B", "C", "D", "E" };
        for (String n : names) {
            Thread t = new Thread(new C(s, "Car " + n));
            t.start();
        }
    }
}
