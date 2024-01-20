package org.dani.sevenKyu;

public class FromAToZ {

    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("a-z"));
    }

    public static String gimmeTheLetters(String s){
        char start = s.charAt(0);
        char end = s.charAt(2);

        StringBuilder result = new StringBuilder();

        for (char current = start; current <= end; current++) {
            result.append(current);
        }

        return result.toString();
    }
}
