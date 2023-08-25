package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {
    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount150Salary60Percent50ThenYear5() {
        double amount = 100;
        int salary = 60;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}