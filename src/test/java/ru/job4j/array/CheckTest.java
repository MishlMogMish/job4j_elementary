package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckTest {

    @Test
    void whenDataMonoTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoFalseThenFalse() {
        boolean[] data = new boolean[] {false, false, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}