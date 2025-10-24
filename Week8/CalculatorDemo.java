package week8;

import java.util.Scanner;

class Calculator {
    public int parseInput(String input) {
        return Integer.parseInt(input);
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int calculate(String num1, String num2) {
        int a = parseInput(num1);
        int b = parseInput(num2);
        return divide(a, b);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        String input1 = sc.nextLine();

        System.out.println("Enter second number:");
        String input2 = sc.nextLine();
        try {
            int result = calculator.calculate(input1, input2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Calculator session ended.");
        }
    }
}
