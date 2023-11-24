package org.example.sixKyu;

import java.util.Arrays;
import java.util.Comparator;

public class Order {

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));;
    }
    public static String order(String words) {
       if (words == null || words.isEmpty()) {
           return "";
       }

        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparingInt(Order::extractNumber))
                .reduce((word1, word2) -> word1 + " " + word2)
                .orElse("");
    }

    private static int extractNumber(String word) {
        return Integer.parseInt(word.replaceAll("\\D", ""));
    }
}
