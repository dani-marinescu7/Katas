package org.dani.sixKyu;

import java.util.Arrays;

public class TheSupermarketQueue {

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for (int customer : customers) {
            result[0] += customer;
            Arrays.sort(result);
        }
        return result[n-1];
    }
}
