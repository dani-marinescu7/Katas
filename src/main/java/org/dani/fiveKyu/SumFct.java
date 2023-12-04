package org.dani.fiveKyu;

import java.math.BigInteger;

public class SumFct {

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(7)));
    }

    public static BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            sum = sum.add(b.multiply(BigInteger.valueOf(4))); // Add the perimeter of the current square

            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return sum;
    }
}
