package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixChekTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixChek.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixChek.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', 'X', ' '},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixChek.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNoMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', ' ', ' '},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixChek.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}