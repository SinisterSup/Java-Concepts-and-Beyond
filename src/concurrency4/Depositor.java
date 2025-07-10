package concurrency4;

public class Depositor implements Runnable {
    private BankAccount bankAccount;

    public Depositor(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (long i = 0; i < 100000; i++) {
            bankAccount.deposit(i);
        }
    }
}
