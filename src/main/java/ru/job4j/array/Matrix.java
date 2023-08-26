package ru.job4j.array;

public class Matrix {
    public static int[][] mutiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row][column] = (row + 1) * (column + 1);
            }
        }
        return table;
    }
}