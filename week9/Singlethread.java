package week9;

public class Singlethread {
    static boolean isprime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        long start = System.currentTimeMillis();
        int c = 0, a = 2;
        while (c < 100) {
            if (isprime(a)) {
                c++;
                System.out.print(a + " ");
            }
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken to finish the task is:" + (end - start));
    }
}
