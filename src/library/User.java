package library;
//import java.util.Random;

public abstract class User {
    // All objects of User class
    // will share the same counter variable.
    static int userCount = 0;
    private String name;
    private String userId;
    private String contactPhone;
    private String contactEmail;

//    // Characters to use in the ID (excluding easily confused characters like 0/O, 1/I)
//    private static final String ID_CHARACTERS = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
//    private static final int ID_LENGTH = 8;
//    private static final Random random = new Random();

    static String generateUniqID() {
        return String.valueOf(++userCount);
    }

    public User() {
        this.userId = generateUniqID();
//        this.userId = UserIdGenerator.generate();
    }
    public User(String name, String contactPhone, String contactEmail) {
        this.name = name;
        this.userId = generateUniqID();
//        this.userId = UserIdGenerator.generate();
//        this.userId = generateUniqueUserID();
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
    }
    public User(User otherUser) {
        this.name = otherUser.name;
        this.userId = otherUser.userId;
        this.contactPhone = otherUser.contactPhone;
        this.contactEmail = otherUser.contactEmail;
    }
//    private String generateUniqueUserID() {
//        StringBuilder idBuilder = new StringBuilder();
//        for (int i = 0; i < ID_LENGTH; i++) {
//            int randomIndex = random.nextInt(ID_CHARACTERS.length());
//            idBuilder.append(ID_CHARACTERS.charAt(randomIndex));
//        }
//        return idBuilder.toString();
//    }
    public String getName() {
        return this.name;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    // Abstract methods
    // Dashboards will be different for a member vs a librarian (child sub-classes)
    public abstract void displayDashboard();
    // Similarly borrowing ability depends on the type of user
    public abstract boolean canBorrowBooks();
}
