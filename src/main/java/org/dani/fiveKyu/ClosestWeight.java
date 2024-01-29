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
            details.add(IntStream.of(digits).sum());
            numberDetails.put(Integer.valueOf(stringNumbers[i]), details);
        }

        Map<Integer, ArrayList<Integer>> sortedMap = new TreeMap<>(numberDetails);
        Iterator<Map.Entry<Integer, ArrayList<Integer>>> iterator = sortedMap.entrySet().iterator();
        Map.Entry<Integer, ArrayList<Integer>> currentEntry = iterator.next();

        int smallestWeight = 1000;

        while (iterator.hasNext()) {
            Map.Entry<Integer, ArrayList<Integer>> nextEntry = iterator.next();

            int currentRank = currentEntry.getValue().get(0);
            int nextRank = nextEntry.getValue().get(0);
            int currentWeight = currentEntry.getValue().get(1);
            int nextWeight = nextEntry.getValue().get(1);

            if (currentWeight - nextWeight > smallestWeight){
                smallestWeight = currentWeight - nextWeight;
            }

            // Move to the next entry
            currentEntry = nextEntry;
        }

        return result;
    }
}
