package week03;

import java.util.Random;

class GameAthlete {
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;
    static int totalAthletes = 0;

    // Default constructor
    public GameAthlete() {
        this("Player", 100, 10);
    }

    // Parameterized constructor
    public GameAthlete(String name, int energy, int skillPower) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = energy;
        this.isActive = true;
        totalAthletes++;
    }

    // Method for competing between athletes
    public void compete(GameAthlete opponent) {
        if (this.isActive && opponent.isActive) {
            opponent.energy -= this.skillPower;

            if (opponent.energy <= 0) {
                opponent.energy = 0;
                opponent.isActive = false;
                System.out.println(this.name + " defeated " + opponent.name + "!");
            } else {
                System.out.println(this.name + " competed with " + opponent.name +
                        " and reduced their energy by " + this.skillPower + ".");
            }
        } else {
            System.out.println("Competition not possible. One of the athletes is inactive.");
        }
    }

    // Method for resting
    public void rest(int amount) {
        if (isActive) {
            this.energy += amount;
            if (this.energy > this.maxEnergy) {
                this.energy = this.maxEnergy;
            }
            System.out.println(this.name + " rested and recovered " + amount + " energy.");
        } else {
            System.out.println(this.name + " cannot rest because they are inactive.");
        }
    }

    // Method for training
    public void train() {
        if (isActive) {
            Random random = new Random();
            int gain = random.nextInt(11); // 0–10
            this.skillPower += gain;
            System.out.println(this.name + " trained and gained " + gain + " skill power.");
        } else {
            System.out.println(this.name + " cannot train because they are inactive.");
        }
    }

    // Display athlete’s stats
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy + "/" + maxEnergy);
        System.out.println("Skill Power: " + skillPower);
        System.out.println("Active: " + isActive);
        System.out.println("----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("ROLL NO: 2024503525");
        System.out.println("DEPARTMENT: CSE\n");

        GameAthlete a1 = new GameAthlete();
        GameAthlete a2 = new GameAthlete("Rama", 120, 15);
        GameAthlete a3 = new GameAthlete("Harish", 110, 12);

        // Competitions
        a1.compete(a2);
        a2.compete(a3);
        a3.compete(a1);

        // Resting
        a1.rest(20);
        a2.rest(15);
        a3.rest(10);

        // Training
        a1.train();
        a2.train();
        a3.train();

        // Display stats
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();

        System.out.println("Total athletes created: " + GameAthlete.totalAthletes);
    }
}
