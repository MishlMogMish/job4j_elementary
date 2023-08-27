package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixChekTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixChek.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixChek.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', 'X', ' '},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixChek.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNoMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', ' ', ' '},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixChek.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    void whenDiagonalFilledWithX() {
        char[][] input = {
                {'X', 'X', ' '},
                {'X', 'X', ' '},
                {' ', 'X', 'X'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenDiagonalFilledWith1() {
        char[][] input = {
                {'1', 'X', ' '},
                {'X', '1', ' '},
                {' ', 'X', '1'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenDiagonalFilledWithXYZ() {
        char[][] input = {
                {'X', 'X', ' '},
                {'X', 'Y', ' '},
                {' ', 'X', 'Z'}
        };
        char[] result = MatrixChek.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenDataNotMonoThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean result = MatrixChek.isWin(input);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoVerticanThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean result = MatrixChek.isWin(input);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataMonoHorizontalThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', 'X', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean result = MatrixChek.isWin(input);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataOnlyDiagMonoThenFalse() {
        char[][] input = {
                {'X', ' ', 'X', ' ', ' '},
                {' ', 'X', 'X', ' ', ' '},
                {' ', 'X', 'X', ' ', ' '},
                {' ', ' ', 'X', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixChek.isWin(input);
        assertThat(result).isFalse();
    }
}