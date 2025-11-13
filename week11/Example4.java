package week11;

public class Example4 {
    public boolean a = false;

    public synchronized void mul3() {
        for (int i = 3; i <= 30; i += 3) {
            System.out.println("Mul 3: " + i);
            if (i == 3) {
                a = true;
                notify();
            }
            try {
                wait(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void mul5() {
        while (!a) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        for (int i = 5; i <= 30; i += 5) {
            System.out.println("Mul 5: " + i);
            try {
                wait(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Example4 obj = new Example4();
        Thread t1 = new Thread(() -> obj.mul3());
        Thread t2 = new Thread(() -> obj.mul5());
        t1.start();
        t2.start();
    }
}
