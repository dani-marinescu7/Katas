package org.dani;

public class KataTTI {
    public static void main(String[] args) {
        System.out.println(battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static String battle(String goodAmounts, String evilAmounts) {
        String[] good = goodAmounts.split(" ");
        String[] evil = evilAmounts.split(" ");

        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        int goodResult = calculate(good, goodWorth);
        int evilResult = calculate(evil, evilWorth);

        if (goodResult > evilResult) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilResult > goodResult) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private static int calculate(String[] amount, int[] worth) {
        int result = 0;

        for (int i = 0; i < amount.length; i++) {
            result += worth[i] * Integer.parseInt(amount[i]);
        }
        return result;
    }
}
