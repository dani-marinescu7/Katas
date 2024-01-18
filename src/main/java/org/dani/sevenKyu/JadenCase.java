package org.dani.sevenKyu;

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
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
            return result.toString().trim();
        }
    }
}
