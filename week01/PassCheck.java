package week01;

import java.util.Scanner;

public class PassCheck {
    public static boolean check(String a) {
        boolean u = false;
        boolean l = false;
        boolean s = false;
        boolean d = false;
        for (char ch : a.toCharArray()) {
            if (Character.isUpperCase(ch))
                u = true;
            else if (Character.isLowerCase(ch))
                l = true;
            else if (Character.isDigit(ch))
                d = true;
            else if ("@#$%&*^".indexOf(ch) != -1)
                s = true;
        }
        return u && l && s && d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password:");
        String a = sc.nextLine();
        if (check(a))
            System.out.println("valid");
        else
            System.out.println("Invalid");
        sc.close();
    }
}
