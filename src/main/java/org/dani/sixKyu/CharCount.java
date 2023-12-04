package org.dani.sixKyu;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {
        String input = "aaabbooootml";

        System.out.println(count(input));
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

        return result;
    }
}
