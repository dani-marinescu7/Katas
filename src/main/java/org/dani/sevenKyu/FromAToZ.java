package org.dani.sevenKyu;

public class FromAToZ {

    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("a-z"));
    }

    public static String gimmeTheLetters(String s){
        StringBuilder result = new StringBuilder();

        for (char current = s.charAt(0); current <= s.charAt(2); current++) {
            result.append(current);
        }

        return result.toString();
    }
}
