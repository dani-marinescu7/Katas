package org.dani.fourKyu;

import java.util.Arrays;

public class NextSmaller {

    public static void main(String[] args) {
        System.out.println(nextSmaller(123456789));
    }

    public static long nextSmaller(long n) {
        char[] digits = Long.toString(n).toCharArray();

        int i = digits.length - 1;
        while (i > 0 && digits[i - 1] <= digits[i]) {
            i--;
        }

        if (i == 0) {
            return -1;
        }

        int j = digits.length - 1;
        while (j > i && digits[j] >= digits[i - 1]) {
            j--;
        }

        char temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;

        reverse(digits, i, digits.length - 1);

        if (digits[0] == '0') {
            return -1;
        }

        return Long.parseLong(new String(digits));
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
