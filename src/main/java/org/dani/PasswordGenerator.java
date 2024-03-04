package org.dani;

import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {

    public static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String lowercase = "abcdefghijklmnopqrstuvwxyz";
    public static String numbers = "0123456789";
    public static String specialChars = "!@#$%^&*()-=_+[]{}|;:',.<>?/";

    public static void main(String[] args) {
        System.out.println(generate());
    }

    private static String generate() {
        StringBuilder result = new StringBuilder();
        int length = new Random().nextInt(13, 20);
        ArrayList<String> characters = new ArrayList<>();
        characters.add(uppercase);
        characters.add(lowercase);
        characters.add(numbers);
        characters.add(specialChars);

        while (length > 0) {
            String randomString = characters.get(new Random().nextInt(0, characters.size()));
            String randomCharacter = String.valueOf(randomString.charAt(new Random().nextInt(0, randomString.length())));
            result.append(randomCharacter);
            length--;
        }


        return result.toString();
    }
}
