package library;

public abstract class Book implements Lendable {
    private String title;
    private String isbn;
    private String author;
    public boolean isAvailable;

    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = false;
    }

    @Override
    public boolean lend(User user) {
        if (this.isAvailable && user.canBorrowBooks()) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }
    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
    }
    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    public abstract void displayBookDetails();
}
