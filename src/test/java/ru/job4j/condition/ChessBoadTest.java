package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ChessBoadTest {

    @Test
    void wayIs6() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void wayIs3() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 0;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void wayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 0;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX1isMinusThenWayIs0() {
        int x1 = -1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX2isMinusThenWayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = -7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY1isMinusThenWayIs0() {
        int x1 = 1;
        int y1 = -1;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY2isMinusThenWayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = -7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX1isGreater7ThenWayIs0() {
        int x1 = 9;
        int y1 = 1;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX2isGreater7ThenWayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 17;
        int y2 = 17;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY1isGreater7ThenWayIs0() {
        int x1 = 8;
        int y1 = 8;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY2isGreater7ThenWayIs0() {
        int x1 = 5;
        int y1 = 9;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoad.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}