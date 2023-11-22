package org.example;

import java.util.Arrays;

public class Order {

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));;
    }
    public static String order(String words) {
       if (words == null || words.isEmpty()) {
           return "";
       }

       String[] splitWords = words.split(" ");
       String[] sortedWords = new String[splitWords.length];

       for (String word : splitWords) {
           for (String character : word.split("")) {
               if (character.matches("-?\\d+(\\.\\d+)?")) {
                   sortedWords[Integer.parseInt(character) - 1] = word;
               }
           }
       }

       return String.join(" ", sortedWords);
    }
}
