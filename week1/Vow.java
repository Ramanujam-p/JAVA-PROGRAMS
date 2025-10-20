package week1;

import java.util.*;

public class Vow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        int[] a = new int[5];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            switch (ch) {
                case 'a':
                    a[0]++;
                    break;
                case 'e':
                    a[1]++;
                    break;
                case 'i':
                    a[2]++;
                    break;
                case 'o':
                    a[3]++;
                    break;
                case 'u':
                    a[4]++;
                    break;
            }
        }
        System.out.println("a:" + a[0]);
        System.out.println("e:" + a[1]);
        System.out.println("i:" + a[2]);
        System.out.println("o:" + a[3]);
        System.out.println("u:" + a[4]);
        sc.close();
    }
}
