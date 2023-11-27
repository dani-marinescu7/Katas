package org.example.sixKyu;

import java.util.HashMap;
import java.util.Map;

public class charCount {

    public static void main(String[] args) {
        String input = "aaabbooootml";

        System.out.println(count(input));
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (result.containsKey(ch)) {
                int currentValue = result.get(ch);
                result.put(ch, currentValue + 1);
            } else {
                result.put(ch, 1);
            }
        }

        return result;
    }
}
