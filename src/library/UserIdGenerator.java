package library;

import java.util.Random;

public class UserIdGenerator {
    private static final String ID_CHARACTERS = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
    private static final int ID_LENGTH = 8;
    private static final Random random = new Random();

    public static String generate() {
        StringBuilder idBuilder = new StringBuilder();
        for (int i = 0; i < ID_LENGTH; i++) {
            int randomIndex = random.nextInt(ID_CHARACTERS.length());
            idBuilder.append(ID_CHARACTERS.charAt(randomIndex));
        }
        return idBuilder.toString();
    }
}