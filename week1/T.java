package week1;

public class T {
    T() {
        this(10);
        System.out.println("default");
    }

    T(int i) {
        this(10, 20);
        System.out.println("one param");
    }

    T(int i, int j) {
        int r = i + j;
        System.out.println("two param");
        System.out.println(r);
    }

    public static void main(String[] args) {
        new T();
    }
}
