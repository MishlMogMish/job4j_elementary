package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = {0, 5, 6};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {0, 5, 6, -5};
        int result = Min.findMin(array);
        int expected = -5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = {0, 5, 6, -10, 4};
        int result = Min.findMin(array);
        int expected = -10;
        assertThat(result).isEqualTo(expected);
    }
}