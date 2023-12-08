package org.dani.sixKyu;

public class MatrixMultiplayer {

    public static void main(String[] args) {
        double[][] matrixA = {
                {1, 2},
                {3, 4},
        };

        double[][] matrixB = {
                {5, 6},
                {7, 8}
        };

        double[][] result = getMatrixProduct(matrixA, matrixB);

        if (result != null) {
            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("\nMatrix B:");
            printMatrix(matrixB);

            System.out.println("\nMatrix Product:");
            printMatrix(result);
        } else {
            System.out.println("Matrices cannot be multiplied.");
        }
    }

    public static double[][] getMatrixProduct(double[][] a, double[][] b) {
        if (a[0].length != b.length) {
            return null;
        }

        double[][] result = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
