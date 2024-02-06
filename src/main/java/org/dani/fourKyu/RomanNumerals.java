package org.dani.fourKyu;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static void main(String[] args) {
        System.out.println(toRoman(10));
        System.out.println(fromRoman("XIV"));
    }

    public static String toRoman(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Input should be between 1 and 3999 (inclusive).");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                result.append(symbols[i]);
                n -= values[i];
            }
        }

        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {

        return 1;
    }
}
