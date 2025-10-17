package week9;

interface action {
    void read();

    void write();

    default void run() {
        System.out.println("running");
    }

    static void eat() {
        System.out.println("eating");
    }
}

class human implements action {
    public void read() {
        System.out.println("reading");
    }

    public void write() {
        System.out.println("writing");
    }
}

public class program1 {
    public static void main(String[] args) {
        human h = new human();
        h.read();
        h.write();
        h.run();
        action.eat();
    }
}
