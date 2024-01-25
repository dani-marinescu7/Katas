package org.dani.fiveKyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClosestWeight {

    public static void main(String[] args) {
        //System.out.println(closest("456899 50 11992 176 272293 163 389128 96 290193 85 52"));
        closest("456899 50 11992 176 272293 163 389128 96 290193 85 52");
    }

    public static int[][] closest(String strng) {
        int[][] result = new int[2][3];
        String[] stringNumbers = strng.split(" ");
        Map<Integer, ArrayList<Integer>> numberDetails = new HashMap<>();

        for (int i = 0; i <= stringNumbers.length - 1; i++) {
            int[] digits = Stream.of(stringNumbers[i].split("")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> details = new ArrayList<>();
            details.add(i);
            details.add(IntStream.of(digits).sum());
            numberDetails.put(Integer.valueOf(stringNumbers[i]), details);
        }
        System.out.println(numberDetails);

        return result;
    }
}
