package org.dani.sevenKyu;

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        if (!phrase.isEmpty()) {
            StringBuilder result = new StringBuilder();
            String[] words = phrase.split(" ");

            for (String word : words) {
                if (!word.isEmpty()) {
                    result.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        result.append(word.substring(1));
                    }
                }
                result.append(" ");
            }
            return result.toString();
        }

        return null;
    }
}
