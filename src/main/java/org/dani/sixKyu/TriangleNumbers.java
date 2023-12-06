package org.dani.sixKyu;

public class TriangleNumbers {

    public static void main(String[] args) {
        System.out.println(isTriangleNumber(6));  // true
        System.out.println(isTriangleNumber(8));  // false
        System.out.println(isTriangleNumber(15)); // true
        System.out.println(isTriangleNumber(14)); // false
    }

    public static Boolean isTriangleNumber(long number) {
        if (number < 0) {
            return false;
        }

        long discriminant = 1 + 8 * number;
        long sqrtDiscriminant = (long) Math.sqrt(discriminant);

        return sqrtDiscriminant * sqrtDiscriminant == discriminant;
    }
}
