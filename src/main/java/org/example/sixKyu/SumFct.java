package org.example.sixKyu;

import java.math.BigInteger;

public class SumFct {

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(7)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 0; i<= n.intValue(); i++) {
            sum += 4 * b;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return BigInteger.valueOf(sum);
    }
}
