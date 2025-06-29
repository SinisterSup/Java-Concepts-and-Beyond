package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private final ArrayList<Book> bookInventory;
    private final ArrayList<User> registeredUsers;

    public  LibraryManagementSystem() {
        this.bookInventory = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }
    public LibraryManagementSystem(ArrayList<Book> bookInventory, ArrayList<User> registeredUsers) {
        this.bookInventory = bookInventory;
        this.registeredUsers = registeredUsers;
    }
    public void addBook(Book book) {
        this.bookInventory.add(book);
    }
    public void registerUser(User user) {
        this.registeredUsers.add(user);
    }

    public List<Book> searchBooks(String isbn) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.bookInventory) {
            if (book.getIsbn().equals(isbn)) {
                books.add(book);
            }
        }
        return books;
    }
}
