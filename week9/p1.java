package week9;

class add extends Thread {
    int x, y;

    add(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public void run() {
        System.out.println("sum is:" + (x + y));
    }
}

class sub extends Thread {
    int x, y;

    sub(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public void run() {
        System.out.println("sub is:" + (x - y));
    }
}

public class p1 {
    public static void main(String[] args) {
        System.out.println("Name:P.RAMANUJAM REG NO:2024503525");
        add obj = new add(5, 2);
        sub o = new sub(5, 2);
        obj.start();
        o.start();
    }
}