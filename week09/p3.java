package week09;

public class p3 {
    private int c = 0;

    public synchronized void count() {
        c++;
    }

    public synchronized int get() {
        return c;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name: P.RAMANUJAM REG NO:2024503525");
        p3 obj = new p3();

        int increments = 100;
        int numThreads = 4;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < increments; j++) {
                    obj.count();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count: " + obj.get()); // 400
    }
}
