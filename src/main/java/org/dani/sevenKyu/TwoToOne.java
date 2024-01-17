package org.dani.sevenKyu;

import java.util.HashSet;
import java.util.Set;

public class TwoToOne {

    public static void main(String args[]) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    public static String longest (String s1, String s2) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            uniqueChars.add(ch);
        }
        for (char ch : s2.toCharArray()) {
            uniqueChars.add(ch);
        }

        // Convert the set to a sorted string
        StringBuilder result = new StringBuilder();
        uniqueChars.stream()
                .sorted()
                .forEach(result::append);

        return result.toString();
    }
}
