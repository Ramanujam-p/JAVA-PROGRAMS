package week09;

class ClassA implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Class A");
    }
}

class ClassB implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Class B");
    }
}

public class p2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name: P.RAMANUJAM\nREG NO: 2024503525");

        ClassA a = new ClassA();
        ClassB b = new ClassB();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        threadB.start();

        // Optional: Wait for threads to finish
        threadA.join();
        threadB.join();

        System.out.println("Main thread finished execution.");
    }
}
