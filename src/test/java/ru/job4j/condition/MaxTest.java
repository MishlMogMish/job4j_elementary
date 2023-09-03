package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1to2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7to3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15to15Then15() {
        int left = 15;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1to15to34Then34() {
        int left = 1;
        int middle = 15;
        int right = 34;
        int result = Max.max(left, middle, right);
        int expected = 34;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax100to15to34Then34() {
        int left = 100;
        int middle = 15;
        int right = 34;
        int result = Max.max(left, middle, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax100to15to34to3Then34() {
        int left = 100;
        int midleft = 15;
        int midright = 34;
        int right = 3;
        int result = Max.max(left, midleft, midright, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax100to15to34to300Then34() {
        int left = 100;
        int midleft = 15;
        int midright = 34;
        int right = 300;
        int result = Max.max(left, midleft, midright, right);
        int expected = 300;
        assertThat(result).isEqualTo(expected);
    }

}