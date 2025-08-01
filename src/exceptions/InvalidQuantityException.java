package exceptions;

// Unchecked Exception for invalid quantity of an Item
public class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
        super(message);
    }
    public InvalidQuantityException(String message, Throwable cause) {
        super(message, cause);
    }
}
