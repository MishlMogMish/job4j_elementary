package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RollBackArrayTest {

    @Test
    void whenEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }
}