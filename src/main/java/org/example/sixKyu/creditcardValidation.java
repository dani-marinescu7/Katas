package org.example.sixKyu;

public class creditcardValidation {

    public static void main(String[] args) {
        System.out.println(validate("2121"));
    }

    public static boolean validate(String n){
        String[] numbers = n.split("");
        int sum = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int number = Integer.parseInt(numbers[i]);
            if ((numbers.length - i) % 2 == 0) {
                number *= 2;

                if (number > 9) {
                    number = number - 9;
                }
            }
            sum += number;
        }

        return sum % 10 == 0;
    }
}
