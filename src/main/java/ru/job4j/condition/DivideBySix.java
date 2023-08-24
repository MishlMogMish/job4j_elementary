package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2  == 0 && number % 3 == 0) {
            rsl = " The number is divisible by 6.";
        } else  if (number % 3 == 0) {
            rsl = " The number is divisible by 3, but isn't  an even number.";
        } else  if (number % 2  == 0) {
            rsl = " The number is not divisible by 3, but is  an even number.";
        } else  {
            rsl = " The number is not divisible by 3, and is not an even number.";
        }
        return rsl;
    }
}
