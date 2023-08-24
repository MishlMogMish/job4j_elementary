package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {

    @Test
    void when7369ThenTrue() {
        int number = 7369;
        boolean result = CheckPrimeNumber.chek(number);
        assertThat(result).isTrue();
    }

    @Test
    void when777299ThenFalse() {
        int number = 777299;
        boolean result = CheckPrimeNumber.chek(number);
        assertThat(result).isFalse();
    }

    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.chek(number);
        assertThat(result).isFalse();
    }
}