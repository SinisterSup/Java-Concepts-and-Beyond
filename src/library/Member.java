package library;

public class Member extends User{
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(String name, int borrowedBooksCount, String contactPhone, String contactEmail) {
        this.borrowedBooksCount = borrowedBooksCount;
        super(name, contactPhone, contactEmail);
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard:");
        System.out.println("Displaying Dashboard for Member");
        System.out.printf("borrowedBooksCount: %d\n", borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return this.borrowedBooksCount <= MAX_BORROW_LIMIT;
    }
}
