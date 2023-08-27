package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DefragmentationTest {

    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEmptyTest() {
        int[] array = {};
        int[] result = Defragmentation.compress(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointEmptyTest() {
        int[] array = {};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotFirst0() {
        int[] array = {-1, 0, 1, 0, 2, 0, 3};
        int[] result = Defragmentation.compress(array);
        int[] expected = {-1, 1, 2, 3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotFirst0() {
        int[] array = {-1, 0, 1, 0, 2, 0, 3};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {-1, 1, 2, 3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst0() {
        int[] array = {0, 1, 0, 2, 0, 3};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 0, 2, 0, 3};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotSotted() {
        int[] array = {-1, 0, 12, 0, 2, 0, -3};
        int[] result = Defragmentation.compress(array);
        int[] expected = {-1, 12, 2, -3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotSorted() {
        int[] array = {-1, 0, 12, 0, 2, 0, -3};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {-1, 12, 2, -3, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }
}