package week1;

import java.util.*;

public class op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs;
        byte fouls;
        boolean status = false;
        System.out.println("enter the number of runs and fouls and made by the team");
        runs = sc.nextInt();
        fouls = sc.nextByte();
        if (runs >= 50 && fouls <= 5) {
            status = true;
            System.out.println("The win status is:" + status);
        } else
            System.out.println("The win status is:" + status);
        System.out.println("runs:" + runs + "fouls:" + fouls);
        sc.close();
    }
}
