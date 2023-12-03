package org.example.sixKyu;

public class TicTacToeChecker {

    public static void main(String[] args) {
        System.out.println(isSolved(new int[][]{
                {0, 2, 1},
                {0, 2, 1},
                {1, 2, 2}
        }));
    }

    public static int isSolved(int[][] board) {
        for (int[] rows : board) {
            for (int col = 0; col < rows.length; col++) {
                if (rows[0] == rows[1] && rows[1] == rows[2] && rows[0] != 0) {
                    return rows[0];
                } else if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != 0) {
                    return board[0][col];
                } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] !=0 || board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] !=0) {
                    return board[1][1];
                } else if (rows[col] == 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
