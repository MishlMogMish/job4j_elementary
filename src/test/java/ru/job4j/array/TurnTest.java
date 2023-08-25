package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenEvenNumElementsInArray123456Then654321() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenOddNumElementsInArray1234567Then7654321() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}