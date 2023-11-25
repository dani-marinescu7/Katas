package org.example.sixKyu;

public class romanNumeralsEncoder {

    public static void main(String[] args) {
        int number = 1990;
        String result = solution(number);
        System.out.println("Roman numeral representation of " + number + ": " + result);
    }

    public static String solution(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Input should be between 1 and 3999 (inclusive).");
        }

        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                result.append(symbols[i]);
                n -= values[i];
            }
        }

        return result.toString();
    }
}
