package oops1.first;

public class BankAccount {
    private final String ownerName;
    double balance;

    // Constructor to initialize BankAccount
    // Parameterized Constructors
    public BankAccount(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Balance of " + ownerName + " is: " + balance);
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount negative");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Raghav", 27);
        bankAccount.showBalance();
        bankAccount.deposit(25.0);
        bankAccount.showBalance();
        bankAccount.withdraw(37.0);
        bankAccount.showBalance();
        bankAccount.deposit(12.5);
        bankAccount.showBalance();
        bankAccount.withdraw(13.0);
        System.out.println(bankAccount.ownerName);  // private ownerName accessible only within same class
    }
}
