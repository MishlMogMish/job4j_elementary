package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2To5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 6, 4, 5, 3, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1To5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 6, 3, 4, 5, 2, 7};
        assertThat(result).containsExactly(expected);
    }
}