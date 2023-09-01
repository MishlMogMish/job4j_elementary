package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public  static  double sumAndMultiply(double first, double second) {
        return  sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumAllFour(double first, double second) {
        return sum(first, second) + subtract(first, second) + multiply(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply(10, 20) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractAndDivide(10, 20) равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета sumAllFour(10, 20) равен: " + sumAllFour(10, 20));
    }

}
