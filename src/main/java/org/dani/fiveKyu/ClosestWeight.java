package org.dani.fiveKyu;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClosestWeight {

    public static void main(String[] args) {
        //System.out.println(closest("456899 50 11992 176 272293 163 389128 96 290193 85 52"));
        closest("456899 50 11992 176 272293 163 389128 96 290193 85 52");
    }

    public static int[][] closest(String strng) {
        int[][] result = new int[2][3];
        String[] stringNumbers = strng.split(" ");
        int[] numbersWeight = new int[stringNumbers.length];

        for (int i = 0; i <= stringNumbers.length; i++) {
            int[] digits = Stream.of(stringNumbers[i].split("")).mapToInt(Integer::parseInt).toArray();
            numbersWeight[i] = IntStream.of(digits).sum();
        }

        return result;
    }
}
