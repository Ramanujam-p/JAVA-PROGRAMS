package week9;

class prime implements Runnable {
    private int start, end, count = 0;

    prime(int s, int e) {
        start = s;
        end = e;
        this.count = 0;
    }

    private static boolean isprime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++)
            if (isprime(i))
                count++;
    }

    public int gc() {
        return count;
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        long start = System.currentTimeMillis();
        prime m1 = new prime(2, 100);
        prime m2 = new prime(101, 500);
        prime m3 = new prime(501, 541);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        int t = m1.gc() + m2.gc() + m3.gc();
        System.out.println(t);
        long end = System.currentTimeMillis();
        System.out.println("time taken to finish the task is :" + (end - start));
    }
}