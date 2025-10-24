package week09;

public class DLock {
    static final Object train = new Object();
    static final Object hotel = new Object();

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM REG NO:2024503525");

        Thread p1 = new Thread(() -> {
            synchronized (train) {
                System.out.println("P1 booked train");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("P1 waiting for hotel");
                synchronized (hotel) {
                    System.out.println("P1 booked hotel");
                }
            }
        });

        Thread p2 = new Thread(() -> {
            synchronized (train) { // Lock train first to avoid deadlock
                System.out.println("P2 booked train");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("P2 waiting for hotel");
                synchronized (hotel) {
                    System.out.println("P2 booked hotel");
                }
            }
        });

        p1.start();
        p2.start();
    }
}
