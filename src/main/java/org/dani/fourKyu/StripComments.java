package org.dani.fourKyu;

import java.util.Arrays;

public class StripComments {

    public static void main(String[] args) {
        //System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"});
    }

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (!word.contains(commentSymbols[0]) || !word.contains(commentSymbols[1])) {
                result.append(word);
            }
        }
        System.out.println(result);

        return result.toString();
    }
}
