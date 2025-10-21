package week3;

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    static int totalGamesPlayed = 0;
    static int totalGuesses = 0;
    static int averageGuess;

    public static void game(Scanner sc) {
        System.out.println("\nWelcome to the Guessing Game!");
        Random r = new Random();
        int secretNumber = r.nextInt(100) + 1; // Generates number between 1 and 100
        int guesses = 0;

        System.out.println("Guess the number between 1 and 100.");
        System.out.println("You have 10 chances to guess the number.");
        System.out.println("Enter -1 to quit this round.\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            guesses++;

            if (guess == -1) {
                guesses--; // don't count exit as a guess
                System.out.println("You exited the game.");
                System.out.println("The secret number was: " + secretNumber);
                break;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess! Please enter a number between 1 and 100.");
                i--; // don't count invalid guess
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("🎉 Congratulations! You found the secret number!");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high! Remaining chances: " + (10 - i));
            } else {
                System.out.println("Too low! Remaining chances: " + (10 - i));
            }

            if (i == 10) {
                System.out.println("You’ve used all your chances.");
                System.out.println("The secret number was: " + secretNumber);
            }
        }

        totalGamesPlayed++;
        totalGuesses += guesses;
    }

    public static void status() {
        System.out.println("\n---- GAME STATUS ----");
        System.out.println("Total games played: " + totalGamesPlayed);
        System.out.println("Total guesses made: " + totalGuesses);
        if (totalGamesPlayed > 0) {
            averageGuess = totalGuesses / totalGamesPlayed;
            System.out.println("Average guesses per game: " + averageGuess);
        } else {
            System.out.println("No games played yet! Play first to see the status.");
        }
        System.out.println("---------------------\n");
    }

    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("ROLL NO: 2024503525");
        System.out.println("DEPARTMENT: CSE\n");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Play Game");
            System.out.println("2. View Status");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    game(sc);
                    break;
                case 2:
                    status();
                    break;
                case 3:
                    System.out.println("Thanks for playing! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
