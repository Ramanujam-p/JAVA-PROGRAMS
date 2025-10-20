package week6.pack1.pack2;

import week6.pack1.Access;

public class Newfile extends Access {
    public void print() {
        System.out.println("the value of public and protected access from another package:" + a + "," + c);

    }

    public static void main(String[] args) {
        Newfile obj2 = new Newfile();
        obj2.print();
    }
}
