package oops1.first;

public class SamePackageDemo {

    public static void main(String[] args) {

        BankAccount samePackageAccount = new BankAccount("samePerson", 100);
        samePackageAccount.balance += 10;  // no issue accessing the attributes of BankAccount within package 'first'

//        // Issue in accessing ownerName attribute from the same package,
//        // because it is private and only accessible within the class where it is declared in.
//        samePackageAccount.ownerName = "newGuy";
    }
}
