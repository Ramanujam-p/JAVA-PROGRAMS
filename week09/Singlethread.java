package week09;

public class Singlethread {

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM\nREG NO: 2024503525");

        long start = System.currentTimeMillis();

        int count = 0;
        int num = 2;
        while (count < 100) {
            if (isPrime(num)) {
                count++;
                System.out.print(num + " ");
                if (count % 10 == 0) // print 10 primes per line
                    System.out.println();
            }
            num++;
        }

        long end = System.currentTimeMillis();
        System.out.println("\nTime taken to finish the task: " + (end - start) + " ms");
    }
}
