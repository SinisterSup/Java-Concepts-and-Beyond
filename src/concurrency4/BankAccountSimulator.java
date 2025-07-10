package concurrency4;

public class BankAccountSimulator {
    static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

//        Runnable depositor = () -> {
//            for (long i = 0; i < 100000; i++) {
//                bankAccount.deposit(i);
//            }
//        };

        Runnable depositor = new Depositor(bankAccount);

        Runnable withdrawers = () -> {
            for (long i = 0; i < 100000; i++) {
                bankAccount.withdraw(i);
            }
        };

        Thread depositorThread = new Thread(depositor);
        Thread withdrawersThread = new Thread(withdrawers);

        depositorThread.start();
        withdrawersThread.start();

        depositorThread.join();
        withdrawersThread.join();

        System.out.println(bankAccount.getBalance());
    }
}