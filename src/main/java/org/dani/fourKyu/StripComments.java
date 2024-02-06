package org.dani.fourKyu;

public class StripComments {

    public static void main(String[] args) {
        System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        //stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"});
    }

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder result = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            String processedLine = removeComments(line, commentSymbols).trim();
            result.append(processedLine).append("\n");
        }

        return result.toString().trim();
    }

    private static String removeComments(String line, String[] commentSymbols) {
        int index = line.length();

        for (String symbol : commentSymbols) {
            int symbolIndex = line.indexOf(symbol);
            if (symbolIndex != -1 && symbolIndex < index) {
                index = symbolIndex;
            }
        }

        return line.substring(0, index);
    }
}
