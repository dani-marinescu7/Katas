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
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                return board[0][i];
            }
        }

        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0) ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != 0)) {
            return board[1][1];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }
        return 0;
    }

}
