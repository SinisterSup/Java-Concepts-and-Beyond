package oops1.second;

import oops1.first.BankAccount;

public class SecondPackageDemo {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount("Someone", 100);
        System.out.println(newAccount);
//        // balance attribute of first.BankAccount can't be accessed since it is package private(by default)
//        newAccount.balance = 120;
    }
}
