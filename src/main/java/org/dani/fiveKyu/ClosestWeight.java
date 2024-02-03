package org.dani.fiveKyu;

import java.util.*;
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
            details.add(Integer.valueOf(stringNumbers[i]));
            numberDetails.put(IntStream.of(digits).sum(), details);
        }
        Map<Integer, ArrayList<Integer>> sortedByWeight = new TreeMap<>(numberDetails);
        ArrayList<Integer> weights = new ArrayList<>(sortedByWeight.keySet());
        int smallestWeightDifference = weights.get(weights.size() - 1);
        Map<Integer, ArrayList<Integer>> smallestDifferences = new HashMap<>();

        for (int i = 0; i <= weights.size() - 1; i++) {
           if (weights.get(i + 1) - weights.get(i) < smallestWeightDifference) {
               smallestWeightDifference = weights.get(i + 1) - weights.get(i);

           }
        }

        System.out.println(sortedByWeight);


        return result;
    }
}
