package week02;

class Bank {
    private static int totalAccounts = 0;
    private int accountNumber;
    private float balance;

    public Bank(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(float amount) {
        balance += amount;
        System.out.println("Account No: " + accountNumber + " | Balance: " + balance);
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public static void main(String[] args) {
        System.out.println("REG NO: 2024503525 NAME: RAMANUJAM");
        Bank acc1 = new Bank(1234, 2000);
        acc1.deposit(200);
        Bank acc2 = new Bank(5678, 1000);
        acc2.deposit(2000);
        showTotalAccounts();
    }
}
