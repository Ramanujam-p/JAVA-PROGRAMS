package week5;

import java.util.Scanner;
import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : str.toCharArray())
            m.put(c, m.getOrDefault(c, 0) + 1);
        System.out.println(m);
        sc.close();
    }
}
