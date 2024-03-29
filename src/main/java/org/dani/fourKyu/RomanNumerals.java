package org.dani.fourKyu;

import java.util.Objects;

public class RomanNumerals {
    public static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void main(String[] args) {
        System.out.println(toRoman(1666));
        System.out.println(fromRoman("DCXCV"));
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
        if (romanNumeral.length() <= 1) {
            return values[findIndex(romanNumeral)];
        }

        String[] romanNumeralCharacters = romanNumeral.split("");
        int result = 0;
        for (int i = 0; i < romanNumeralCharacters.length - 1; i++) {
            int currentValue = values[findIndex(romanNumeralCharacters[i])];
            int nextValue = values[findIndex(romanNumeralCharacters[i + 1])];
            if (currentValue < nextValue) {
                result += nextValue - currentValue;
                if (i == romanNumeralCharacters.length - 3) {
                    result += values[findIndex(romanNumeralCharacters[i + 2])];
                }
                i++;
            } else {
                result += currentValue;
                if (i == romanNumeralCharacters.length - 2) {
                    result += nextValue;
                }
            }
        }
        return result;
    }

    private static int findIndex(String symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (Objects.equals(symbol, symbols[i])) {
                return i;
            }
        }
        return 0;
    }
}
