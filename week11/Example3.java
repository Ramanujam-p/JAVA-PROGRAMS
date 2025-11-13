package week11;

class IBalException extends Exception {
    public IBalException(String m) {
        super(m);
    }
}

class InvalidAccNoException extends Exception {
    public InvalidAccNoException(String m) {
        super(m);
    }
}

class Bank {
    String accNo;
    String name;
    double balance;

    Bank(String accNo, String name, double balance) throws InvalidAccNoException {
        validateAccno(accNo);
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount <= 0)
            System.out.println("Deposited amount must be positive");
        else {
            balance += amount;
            System.out.println("Deposited money:" + amount + "Bank balance:" + balance);
        }
    }

    void withdraw(int amount) throws IBalException {
        if (amount > balance)
            throw new IBalException("insufficient balance");
        balance -= amount;
        System.out.println("Withdrawn amount:" + amount);

    }

    public void validateAccno(String accno) throws InvalidAccNoException {
        if (accno.length() != 10)
            throw new InvalidAccNoException("Account number must contain exactly 10 characters");
        if (!Character.isLetter(accno.charAt(0)))
            throw new InvalidAccNoException("First character must be an alphabet");
        for (int i = 1; i < 10; i++)
            if (!Character.isDigit(accno.charAt(i)))
                throw new InvalidAccNoException("Character 2 to 10 must be numeric digits");
    }

    public void display() {
        System.out.println("Account no:" + accNo + "\nAccount holder name:" + name + "\nBalance:" + balance);
    }
}

public class Example3 {
    public static void main(String[] args) {
        try {
            Bank b = new Bank("A123456789", "Rama", 10000);
            b.display();
            b.deposit(2000);
            b.withdraw(50000);
        } catch (InvalidAccNoException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (IBalException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

}
