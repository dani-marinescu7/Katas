package org.dani.sixKyu;

import java.util.Arrays;

public class TheSupermarketQueue {

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (n == 1) {
            return Arrays.stream(customers).sum();
        }

        int[] tills = new int[n];
        int totalTime = 0;

        for (int nextCustomerTime : customers) {
            int minTillIndex = findMinTillIndex(tills);
            tills[minTillIndex] += nextCustomerTime;
            totalTime = Math.max(totalTime, tills[minTillIndex]);
        }

        return totalTime;
    }

    private static int findMinTillIndex(int[] tills) {
        int minTillIndex = 0;
        for (int i = 1; i < tills.length; i++) {
            if (tills[i] < tills[minTillIndex]) {
                minTillIndex = i;
            }
        }
        return minTillIndex;
    }
}
