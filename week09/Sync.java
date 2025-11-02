package week09;

class Table {
    synchronized public void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }

        }
    }
}

class T1 extends Thread {
    Table t;

    T1(Table t) {
        this.t = t;
    }

    public void run() {
        t.print(5);
    }
}

class T2 extends Thread {
    Table t;

    T2(Table t) {
        this.t = t;
    }

    public void run() {
        t.print(100);
    }
}

public class Sync {
    public static void main(String[] args) {
        Table obj = new Table();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);
        t1.start();
        t2.start();
    }
}
