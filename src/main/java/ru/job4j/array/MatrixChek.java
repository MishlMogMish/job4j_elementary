package ru.job4j.array;

public class MatrixChek {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}