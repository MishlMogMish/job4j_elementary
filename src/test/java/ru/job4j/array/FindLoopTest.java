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

    @Test
    void  whenDiapasonHas8ThanResultEqualFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 12, 4, 3, 25, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenDiapasonHas4ThanResultEqualStart() {
        int[] data = {5, 2, 10, 2, 4, 8, 2, 4, 3, 2, 2};
        int el = 4;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenDiapasonHasSomeEqualElementThan1() {
        int[] data = {5, 2, 10, 2, 4, 8, 2, 4, 3, 2, 2};
        int el = 2;
        int start = 1;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenDiapasonHas2Than() {
        int[] data = {5, 2, 10, 2, 4, 8, 2, 4, 3, 2, 2};
        int el = 2;
        int start = 4;
        int finish = 9;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void  whenDiapasonHasNot7ThanMinus1() {
        int[] data = {5, 2, 10, 2, 4, 8, 2, 4, 3, 2, 2};
        int el = 7;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}