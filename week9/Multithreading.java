package week9;

class Prime implements Runnable {
    private int start, end;
    private int count;

    Prime(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    private static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                count++;
    }

    public int getCount() {
        return count;
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name: P.RAMANUJAM\nREG NO: 2024503525");

        long startTime = System.currentTimeMillis();

        Prime prime1 = new Prime(2, 100);
        Prime prime2 = new Prime(101, 500);
        Prime prime3 = new Prime(501, 541);

        Thread t1 = new Thread(prime1);
        Thread t2 = new Thread(prime2);
        Thread t3 = new Thread(prime3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        int totalPrimes = prime1.getCount() + prime2.getCount() + prime3.getCount();
        System.out.println("Total prime numbers: " + totalPrimes);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to finish the task: " + (endTime - startTime) + " ms");
    }
}
