package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    @Test
    void when10then4() {
        int finish = 10;
        int result = PrimeNumber.calc(finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when11then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when12then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1then0() {
        int finish = 1;
        int result = PrimeNumber.calc(finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}