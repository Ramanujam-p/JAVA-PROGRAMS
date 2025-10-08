package week9;

public class p3 {
    private int c = 0;

    public synchronized void count() {
        c++;
    }

    public synchronized int get() {
        return c;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        p3 obj = new p3();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                obj.count();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                obj.count();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count:" + obj.get());
    }
}