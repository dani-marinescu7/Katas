package org.dani.sixKyu;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    public static int duplicateCount(String text) {
        int result = 0;
        Map<String, Integer> charactersCount = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            String character = String.valueOf(text.toLowerCase().charAt(i));
            if (charactersCount.containsKey(character)) {
                charactersCount.put(character, charactersCount.get(character) + 1);
            } else {
                charactersCount.put(character, 1);
            }
        }

        for (int values : charactersCount.values()) {
            if (values > 1) {
                result++;
            }
        }

        return result;
    }
}
