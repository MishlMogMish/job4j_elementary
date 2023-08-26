package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixTest {

    @Test
    void when2By2() {
        int size = 2;
        int[][] result = Matrix.mutiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    void when5By5() {
        int size = 5;
        int[][] result = Matrix.mutiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}