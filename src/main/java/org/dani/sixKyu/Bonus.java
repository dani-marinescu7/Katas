package org.dani.sixKyu;

import java.util.Arrays;

public class Bonus {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bonus(new int[]{18, 15, 12}, 851)));
        //[230, 276, 345]
        //230 * 18 = 276 * 15 = 345 * 12 and 230 + 276 + 345 = 851
    }

    public static long[] bonus(int[] arr, long s) {
        double[] inverseProportion = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inverseProportion[i] = 1.0 / arr[i];
        }
        double sumOfInverseProportion = Arrays.stream(inverseProportion).sum();
        long[] calculateBonus = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            calculateBonus[i] = Math.round(inverseProportion[i] / sumOfInverseProportion * s);
        }

        return calculateBonus;
    }
}
