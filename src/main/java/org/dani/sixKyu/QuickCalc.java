package org.dani.sixKyu;

import java.math.BigInteger;

public class QuickCalc {

    public static void main(String[] args) {
        System.out.println(choose(1, 1));   // Output: 1
        System.out.println(choose(5, 4));   // Output: 5
        System.out.println(choose(10, 5));  // Output: 252
        System.out.println(choose(10, 20)); // Output: 0
    }

    public static BigInteger choose(int n, int p) {
        if (p < 0 || p > n) {
            return BigInteger.ZERO;
        }

        p = Math.min(p, n - p);
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < p; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }

        return result;
    }
}
