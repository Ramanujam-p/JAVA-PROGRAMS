package week01;

import java.util.*;

public class sp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string:");
        String a = sc.nextLine();
        System.out.println("enter the second string:");
        String b = sc.nextLine();
        System.out.println("the substring:" + a.substring(0, 3));
        System.out.println("String length:" + a.length());
        System.out.println("are the both the strings are equal:" + a.equals(b));
        System.out.println("are the both the strings are equal:" + a.equalsIgnoreCase(b));
        System.out.println("The first character of the string:" + a.charAt(0));
        System.out.println("enter the string to search:");
        String c = sc.nextLine();
        System.out.println("is the string contains or not?" + b.contains(c));
        System.out.println("compare the two strings:" + a.compareTo(b));
        System.out.println("compare the two strings:" + b.compareTo(c));
        System.out.println("compare the two strings:" + b.compareToIgnoreCase(c));
        char[] y = a.toCharArray();
        for (char x : y)
            System.out.print(x + " ");
        String str = "Welcome to java";
        int l = str.length();
        System.out.println("length" + l);
        System.out.println("the upper case and lower case:" + str.toUpperCase() + str.toLowerCase());
        int index = str.indexOf('a');
        int index2 = str.lastIndexOf('a');
        System.out.println("the values are:" + index + index2);
        sc.close();
    }
}
