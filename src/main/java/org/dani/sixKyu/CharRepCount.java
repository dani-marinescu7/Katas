package org.dani.sixKyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharRepCount {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestRepetition("bbbaaabaaaa")));
    }

    public static Object[] longestRepetition(String s) {
        String[] splitString = s.split("");
        Map<String, Integer> charCount = new HashMap<>();
        Object[] result = new Object[]{"", 0};

        for (String character : splitString) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : charCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value > Integer.parseInt(result[1].toString())) {
                result[0] = key;
                result[1] = value;
            }
        }

        return result;
    }
}
