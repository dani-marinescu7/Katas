package org.example.fiveKyu;

import java.math.BigDecimal;

public class RgbToHex {

    public static void main(String[] args) {

        System.out.println(rgb(-20,275,125));

    }

    public static String rgb(int r, int g, int b) {
        r = converter(r);
        g = converter(g);
        b = converter(b);

        String R = doubleToHexConverter(truncateDecimal((double) r / 16, 2).doubleValue());
        String G = doubleToHexConverter(truncateDecimal((double) g / 16, 2).doubleValue());
        String B = doubleToHexConverter(truncateDecimal((double) b / 16, 2).doubleValue());


        return R + G + B;
    }

    private static int converter(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 255) {
            i = 255;
        }

        return i;
    }

    private static String doubleToHexConverter(double number) {
        int x = (int) number;
        int y = afterDecimalNumber(number);

        String X = numberToHex(x);
        String Y = numberToHex(y);

        return X + Y;
    }

    private static BigDecimal truncateDecimal(double x, int numberofDecimals)
    {
        if ( x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
        }
    }

    private static int afterDecimalNumber(double number) {

        String numberAsString = Double.toString(number);
        int decimalIndex = numberAsString.indexOf('.');
        String newNumberAsString = 0 + "." + numberAsString.substring(decimalIndex + 1);

        return (int) Math.ceil(Double.parseDouble(newNumberAsString) * 16);
    }

    private static String numberToHex(int number) {
        return switch (number) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(number);
        };
    }
}
