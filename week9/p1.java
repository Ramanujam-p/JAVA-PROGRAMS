package week9;

class Add extends Thread {
    int x, y;

    Add(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public void run() {
        System.out.println("Sum is: " + (x + y));
    }
}

class Sub extends Thread {
    int x, y;

    Sub(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public void run() {
        System.out.println("Subtraction is: " + (x - y));
    }
}

public class p1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name: P.RAMANUJAM\nREG NO: 2024503525");

        Add addThread = new Add(5, 2);
        Sub subThread = new Sub(5, 2);

        addThread.start();
        subThread.start();

        // Wait for both threads to finish
        addThread.join();
        subThread.join();

        System.out.println("Main thread finished execution.");
    }
}
