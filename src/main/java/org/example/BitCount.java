package org.example;

public class BitCount {

    public static int countBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int input = 1234;
        int result = countBits(input);

        // Print the result
        System.out.println("Number of set bits: " + result);
    }
}

