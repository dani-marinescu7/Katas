package org.dani.sixKyu;

public class BitCount {

    public static int countBits(int n) { return Integer.bitCount(n); }

    public static void main(String[] args) {
        int input = 1234;
        int result = countBits(input);

        System.out.println("Number of set bits: " + result);
    }
}

