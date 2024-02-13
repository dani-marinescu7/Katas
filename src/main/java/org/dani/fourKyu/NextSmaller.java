package org.dani.fourKyu;

import java.util.Arrays;

public class NextSmaller {

    public static void main(String[] args) {
        System.out.println(nextSmaller(123456789));
    }

    public static long nextSmaller(long n) {
        String[] digits = Long.toString(n).split("");
        for (long i = n - 1; i >= 0; i--) {
            String[] newDigits = Long.toString(i).split("");
            Arrays.sort(digits);
            Arrays.sort(newDigits);

            if (Arrays.equals(digits, newDigits))  {
                return i;
            }
        }
        return -1;
    }
}
