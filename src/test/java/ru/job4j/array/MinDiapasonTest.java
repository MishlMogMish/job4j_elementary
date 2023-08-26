package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void whenFirstMin() {
        int[] array = {-5, 8, 6, 7, 12, -8};
        int start = 2;
        int finish = 4;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {-5, 8, 6, 7, 12, -8, 5};
        int start = 1;
        int finish = 5;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = -8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = {-5, 8, 6, 7, 12, -8};
        int start = 1;
        int finish = 4;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}