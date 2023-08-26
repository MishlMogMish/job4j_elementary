package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort3El() {
        int[] data = {4, 7, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 4, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort5El() {
        int[] data = {4, 7, 2, 1, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 4, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort10El() {
        int[] data = {4, 7, 2, 10, 8, 9, 3, 5, 1, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}