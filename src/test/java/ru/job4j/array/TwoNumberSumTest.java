package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void whenTwoEqualNumberYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTwoEqualNumberNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 0;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 5, 8, 12, 15, 100};
        int target = 23;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).containsExactly(expected);
    }
}