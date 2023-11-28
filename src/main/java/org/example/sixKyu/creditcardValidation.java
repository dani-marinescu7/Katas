package org.example.sixKyu;

public class creditcardValidation {

    public static void main(String[] args) {
        System.out.println(validate("2121"));
    }

    public static boolean validate(String n){
        String[] numbers = n.split("");
        int sum = 0;

        if (numbers.length % 2 == 0) {
            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (i % 2 == 0) {
                    if ((number * 2) > 9) {
                        number = (number * 2) - 9;
                    } else {
                        number = number * 2;
                    }
                }
                sum += number;
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (i % 2 != 0) {
                    if ((number * 2) > 9) {
                        number = (number * 2) - 9;
                    } else {
                        number = number * 2;
                    }
                }
                sum += number;
            }
        }
        return sum % 10 == 0;
    }
}
