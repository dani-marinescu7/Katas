package org.example.sixKyu;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }

        int length = s.length();
        int arrayLength = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        String[] result = new String[arrayLength];

        for (int i = 0, j = 0; i < length; i += 2, j++) {
            if (i + 1 < length) {
                result[j] = s.substring(i, i + 2);
            } else {
                result[j] = s.substring(i) + "_";
            }
        }

        return result;
    }
}
