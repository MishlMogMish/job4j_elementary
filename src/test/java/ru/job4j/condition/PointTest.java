package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when0x0to2x0Then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1x1to4x5Then5() {
        double expected = 5;
        Point first = new Point(1, 1);
        Point second = new Point(4, 5);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when2x3to14x8Then13() {
        double expected = 13;
        Point first = new Point(2, 3);
        Point second = new Point(14, 8);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when30x0to0x40Then50() {
        double expected = 50;
        Point first = new Point(30, 0);
        Point second = new Point(0, 40);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}