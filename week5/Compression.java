package week5;

import java.util.Scanner;

class Compression {

    // Method to compress string
    public static String compress(String s) {
        if (s == null || s.isEmpty())
            return s; // handle empty input

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and its count
        sb.append(s.charAt(s.length() - 1)).append(count);

        // Return compressed string only if shorter than original
        String compressed = sb.toString();
        return compressed.length() < s.length() ? compressed : s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("NAME: RAMANUJAM.P");
        System.out.println("REG NO: 2024503525\n");

        System.out.print("Enter a string to compress: ");
        String input = sc.nextLine();

        String result = compress(input);
        System.out.println("Compressed string: " + result);

        sc.close();
    }
}
