package week02;

import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:P.RAMANUJAM");
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSums = new int[3];
        System.out.println("Enter the elements of a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 numbers for row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                rowSums[i] += matrix[i][j];
            }
        }
        System.out.println("\nRow sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + " sum = " + rowSums[i]);
        }
        int maxSum = rowSums[0];
        int maxRow = 1;
        for (int i = 1; i < 3; i++) {
            if (rowSums[i] > maxSum) {
                maxSum = rowSums[i];
                maxRow = i + 1; // 1-indexed for display
            }
        }

        System.out.println("\nRow " + maxRow + " has the highest sum: " + maxSum);
        sc.close();
    }
}
