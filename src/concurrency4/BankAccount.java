package concurrency4;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    // Class level Lock.(class.lock())
    public synchronized static void temp() {
        System.out.println("temp");
    }

    // Object level Lock. (object.lock())
    public synchronized void deposit(Long amount) {
        // `Synchronized` keyword (used with method declaration)
        // here would ensure that the caller
        // has the access to the lock Bank Account object;
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public synchronized void withdraw(Long amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
    }
}