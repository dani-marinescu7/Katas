package org.example;

import static org.example.StringSplit.solution;

public class Main {
    public static void main(String[] args) {
        String input = "abcdefg";
        String[] result = solution(input);

        for (String pair : result) {
            System.out.println(pair);
        }
    }
}