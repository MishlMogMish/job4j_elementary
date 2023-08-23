package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumberFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumberFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}