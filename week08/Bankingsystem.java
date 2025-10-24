package week08;

class InsufficientFundsException extends Exception {
    private double balance;
    private double shortfall;

    public InsufficientFundsException(double balance, double shortfall) {
        super("insufficient funds:balance:" + balance + "\n" + "shortfall:" + shortfall);
        this.balance = balance;
        this.shortfall = shortfall;
    }

    public double getBalance() {
        return balance;
    }

    public double getShortfall() {
        return shortfall;
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Bankaccount {
    private String accountid;
    private double balance;

    public Bankaccount(String accountid, double balance) throws InvalidAmountException {
        if (accountid == null || accountid.isEmpty())
            throw new IllegalArgumentException("when the account id is empty");
        if (balance < 0)
            throw new InvalidAmountException("Initial balance cannot be negative");
        this.accountid = accountid;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("amount must be positive");
        balance += amount;
        System.out.println("The deposited amount:" + amount + "new balance:" + balance);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0)
            throw new InvalidAmountException("withdrawl must be positive");
        if (amount > balance)
            throw new InsufficientFundsException(balance, amount - balance);
        balance -= amount;
        System.out.println("withdraw amount:" + amount + "after withdrawl new balance:" + balance);
    }

    public void transfer(Bankaccount target, double amount) throws InvalidAmountException, InsufficientFundsException {
        if (target == null)
            throw new IllegalArgumentException("target cannot be null");
        this.withdraw(amount);
        target.deposit(amount);
        System.out.println("Transferred:" + amount + " from " + this.accountid + " to " + target.accountid);
    }

    public double getBalance() {
        return balance;
    }
}

public class Bankingsystem {
    public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
        System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        Bankaccount acc1 = null;
        Bankaccount acc2 = null;
        try {
            // normal scenarios
            acc1 = new Bankaccount("acc1", 1000);
            acc2 = new Bankaccount("acc2", 500);
            acc1.deposit(500);
            acc1.withdraw(200);
            acc1.transfer(acc2, 300);
            System.out.println("The balance amount in acc1:" + acc1.getBalance());
            System.out.println("The balance amount in acc1:" + acc2.getBalance());
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        // exception cases
        try {
            acc1.withdraw(5000);
        } catch (InsufficientFundsException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
