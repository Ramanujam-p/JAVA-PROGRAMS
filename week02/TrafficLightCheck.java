package week02;

import java.util.Scanner;

public class TrafficLightCheck {
    public static void main(String[] args) {
        System.out.println("REG NO:2024503525 NAME:P.RAMANUJAM");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light (red, yellow, green): ");
        String color = sc.nextLine().trim().toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Ready to move");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid color");
                break;
        }

        sc.close();
    }
}
