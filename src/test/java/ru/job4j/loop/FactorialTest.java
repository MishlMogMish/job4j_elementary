package ru.job4j.loop;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void factorial5Is120() {
        int in = 5;
        int expected = 120;
        int result = Factorial.calc(in);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void factorial7Is5040() {
        int in = 5;
        int expected = 120;
        int result = Factorial.calc(in);
        assertThat(result).isEqualTo(expected);
    }
}