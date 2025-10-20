package week2;

import java.util.Scanner;

class Attendance {
    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:RAMANUJAM");
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][8];
        for (int days = 0; days < 5; days++) {
            System.out.println("Enter the attendance for Day " + (days + 1) + ":");
            for (int hours = 0; hours < 8; hours++) {
                System.out.print("  Hour " + (hours + 1) + " (1=Present, 0=Absent): ");
                a[days][hours] = sc.nextInt();
            }
        }
        int totalPresent = 0;
        for (int days = 0; days < 5; days++) {
            int dailyPresent = 0;
            for (int hours = 0; hours < 8; hours++) {
                dailyPresent += a[days][hours];
            }
            double dailyPercentage = ((double) dailyPresent / 8) * 100;
            System.out.println("Daily percentage for Day " + (days + 1) + ": " + dailyPercentage + "%");

            totalPresent += dailyPresent;
        }
        double weeklyPercentage = ((double) totalPresent / 40) * 100;
        System.out.println("\nWeekly attendance percentage: " + weeklyPercentage + "%");

        sc.close();
    }
}
