package week5;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length())
            return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two string:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (anagram(s1, s2))
            System.out.println("both the strings are anagrams");
        else
            System.out.println("both the strings are not the anagrams");
        sc.close();
    }
}
