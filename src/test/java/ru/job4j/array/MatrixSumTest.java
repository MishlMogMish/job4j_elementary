package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixSumTest {

    @Test
    void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwo() {
        int[][] array = {
                {1, 2},
                {3, 4}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {
                {1, 2, 3},
                {5, 4, 6}
        };
        int result = MatrixSum.sum(array);
        int expected = 21;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDifferentLength() {
        int[][] array = {
                {1},
                {5, 4},
                {6, 2, 8, 3, 7},
                {9, 11, 10}
        };
        int result = MatrixSum.sum(array);
        int expected = 66;
        assertThat(result).isEqualTo(expected);
    }
}