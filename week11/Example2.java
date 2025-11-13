package week11;

public class Example2 {
    private static int a = 1;
    private static final int b = 20;

    synchronized public void printodd() {
        while (a <= b) {
            while (a % 2 == 0) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (a <= b) {
                System.out.println(a + " ");
                a++;
                notify();
            }
        }
    }

    synchronized public void printeven() {
        while (a <= b) {
            while (a % 2 != 0) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (a <= b) {
                System.out.println(a + " ");
                a++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        Thread odd = new Thread(() -> obj.printodd());
        Thread even = new Thread(() -> obj.printeven());
        odd.start();
        even.start();
    }
}
