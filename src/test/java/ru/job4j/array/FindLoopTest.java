package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new  int[] {5, 12, 7};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new  int[] {5, 12, 7, 76};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas50Then3() {
        int[] data = new  int[] {5, 12, 7, 50, -8};
        int el = 50;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}