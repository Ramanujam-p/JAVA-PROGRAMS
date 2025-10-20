package week2;

import java.util.Scanner;

public class VowelFrequency {
    public static void countVowels(String input) {

        // Convert input to lowercase and to character array
        char[] letters = input.toLowerCase().toCharArray();

        // Vowel frequency counters
        int[] vowelCounts = new int[5]; // a, e, i, o, u

        // Count vowels using index mapping
        for (char ch : letters) {
            switch (ch) {
                case 'a':
                    vowelCounts[0]++;
                    break;
                case 'e':
                    vowelCounts[1]++;
                    break;
                case 'i':
                    vowelCounts[2]++;
                    break;
                case 'o':
                    vowelCounts[3]++;
                    break;
                case 'u':
                    vowelCounts[4]++;
                    break;
                default:
                    break; // Ignore non-vowel characters
            }
        }

        // Display results
        String[] vowels = { "a", "e", "i", "o", "u" };
        System.out.println("\nVowel Frequencies:");
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + ": " + vowelCounts[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:P.RAMANUJAM");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        countVowels(userInput); // Analyze vowels

        scanner.close();
    }
}
