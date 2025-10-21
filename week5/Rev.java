package week5;

import java.util.Scanner;

class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s1 = sc.nextLine();
        String s2 = r(s1);
        System.out.println(s2);
        sc.close();
    }

    public static String r(String s) {
        StringBuilder a = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            a.append(s.charAt(i));
        return a.toString();
    }
}