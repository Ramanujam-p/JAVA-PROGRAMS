package week09;

import java.util.*;

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class Vowelcheck {
    static void checkVowel(String str) throws NoVowelException {
        str = str.toLowerCase();
        if (!(str.contains("a")) && !(str.contains("e")) && !(str.contains("i")) && !(str.contains("o"))
                && !str.contains("u")) {
            throw new NoVowelException("it contains no vowels");
        } else
            System.out.println("it contains vowels");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String a = sc.nextLine();
        try {
            checkVowel(a);
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
