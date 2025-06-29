package library;

public class Librarian extends User {
    private final int employeeNumber;

    public Librarian(int employeeNumber) {
        this.employeeNumber = employeeNumber;
        super();
    }
    public Librarian(String name, String contactPhone, String contactEmail,  int employeeNumber) {
        this.employeeNumber = employeeNumber;
        super(name, contactPhone, contactEmail);
    }
    public Librarian(Librarian otherLibrarian) {
        super(otherLibrarian);
        this.employeeNumber = otherLibrarian.employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Displaying Dashboard for Librarian");
        System.out.println("Employee Number: " + this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return false;
    }

//    public void addNewBook(Book newBook) {
//        // Implementation for adding a new book to library
//    }
//    public void removeBook(Book book) {
//        // Implementation for removing a book
//    }
}
