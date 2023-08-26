package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EndsWithTest {

    @Test
    void whenEndsWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean resulte = EndsWith.endsWith(word, post);
        assertThat(resulte).isTrue();
    }

    @Test
    void whenNotEndsWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'i'};
        boolean resulte = EndsWith.endsWith(word, post);
        assertThat(resulte).isFalse();
    }
}