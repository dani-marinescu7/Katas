package org.example.sixKyu;

public class creditcardValidation {

    public static void main(String[] args) {
        System.out.println(validate("891"));
    }

    public static boolean validate(String n){
        StringBuilder sb = new StringBuilder(n);
        int sum = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.length() % 2 == 0) {
                if (i % 2 == 0) {
                    if (sb.charAt(i) * 2 > 9) {
                        sb.setCharAt(i, (char) ((sb.charAt(i) * 2) - 9));
                    }
                }
            } else if (sb.length() % 2 != 0) {
                if (i % 2 != 0) {
                    if (sb.charAt(i) * 2 > 9) {
                        sb.setCharAt(i, (char) ((sb.charAt(i) * 2) - 9));
                    }
                }
            }
            sum += sb.charAt(i);
        }

        return sum % 10 == 0;
    }
}
