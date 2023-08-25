package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCharTest {

    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'a'};
        boolean result = ArrayChar.startWith(word, pref);
        assertThat(result).isFalse();
    }
}