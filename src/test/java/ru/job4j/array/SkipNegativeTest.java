package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SkipNegativeTest {

    @Test
    void whenArrayRowAndColumnEqual() {
        int[][] array = {
                {1, -5},
                {3, 6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {3, 6}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    void whenArrayRowAndColumnNotEqual() {
        int[][] array = {
                {1, -5},
                {3, 6, -4, -7},
                {0, -50, 3},
                {17, -3, -5, 8, 5, 5, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {3, 6, 0, 0},
                {0, 0, 3},
                {17, 0, 0, 8, 5, 5, 5}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}