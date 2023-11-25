package org.example.fiveKyu;

public class RgbToHex {

    public static void main(String[] args) {
        System.out.println(rgb(-20,275,125));
    }

    public static String rgb(int r, int g, int b) {
        r = converter(r);
        g = converter(g);
        b = converter(b);

        return toHex(r) + toHex(g) + toHex(b);
    }

    private static int converter(int value) {
        return Math.min(255, Math.max(0, value));
    }

    private static String toHex(int number) {
        int quotient = number / 16;
        int reminder = number % 16;

        return hexDigit(quotient) + hexDigit(reminder);
    }

    private static String hexDigit(int digit) {
        return switch (digit) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(digit);
        };
    }
}
