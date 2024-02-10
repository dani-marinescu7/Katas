package org.dani.sixKyu;

import java.util.Arrays;

public class Bonus {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bonus(new int[]{18, 15, 12}, 851)));
    }

    public static long[] bonus(int[] arr, long s) {
        double sumOfInverseProportion = Arrays.stream(arr).mapToDouble(value -> 1.0 / value).sum();
        return Arrays.stream(arr).mapToLong(value -> Math.round(1.0 / value / sumOfInverseProportion * s)).toArray();
    }
}
