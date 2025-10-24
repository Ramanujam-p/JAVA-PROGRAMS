package week09;

import java.util.concurrent.*;

class Car implements Runnable {
    private String name;
    private Semaphore parkingLot;

    Car(Semaphore sem, String name) {
        this.name = name;
        this.parkingLot = sem;
    }

    @Override
    public void run() {
        System.out.println(name + " arriving at the lot.");
        try {
            System.out.println(name + " waiting for a slot...");
            parkingLot.acquire();
            System.out.println(name + " parked. Available slots: " + parkingLot.availablePermits());
            Thread.sleep(2000); // Simulate parking time
            System.out.println(name + " leaving lot.");
            parkingLot.release();
            System.out.println(name + " left. Available slots: " + parkingLot.availablePermits());
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
    }
}

public class P {
    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM   REG NO: 2024503525");

        Semaphore parkingLot = new Semaphore(2); // 2 parking slots

        String[] carNames = { "A", "B", "C", "D", "E" };
        Thread[] threads = new Thread[carNames.length];

        for (int i = 0; i < carNames.length; i++) {
            threads[i] = new Thread(new Car(parkingLot, "Car " + carNames[i]));
            threads[i].start();
        }

        // Wait for all cars to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All cars have left the parking lot.");
    }
}
