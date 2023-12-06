package org.dani.sixKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeadFish {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
        System.out.println(Arrays.toString(parse("iiisdosodddddiso")));
    }
    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<>();
        String[] commands = data.split("");
        int value = 0;

        for (String command : commands) {
            switch (command) {
                case "i" -> value += 1;
                case "d" -> value -= 1;
                case "s" -> value *= value;
                case "o" -> result.add(value);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
