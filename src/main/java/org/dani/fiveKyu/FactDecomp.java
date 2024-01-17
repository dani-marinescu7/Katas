package org.dani.fiveKyu;

import java.util.ArrayList;
import java.util.List;

public class FactDecomp {

    public static void main(String[] args) {
        decomp(12);
    }

    public static String decomp(int n) {
        List<Integer> primeFactors = primeFactors(n);
        System.out.println(primeFactors);
        return null;
    }

    private static List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        result.add(2);

        for (int i = 3; i <= number; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result.add(i);
            }
        }
        return result;
    }
}
