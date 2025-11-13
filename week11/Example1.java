package week11;

public class Example1 {
    public static <T> void printarray(T[] a) {
        for (T b : a)
            System.out.println(b);
    }

    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3 };
        Character[] c = { 'a', 'b', 'c' };
        Double[] d = { 1.1, 2.2, 3.3 };
        printarray(i);
        printarray(c);
        printarray(d);
    }
}