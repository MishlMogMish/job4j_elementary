package ru.job4j.loop;

public class Mortgage {
    public static int year(double amoumt, int salary, double percent) {
        int year = 0;
        while (amoumt > 0) {
            amoumt = amoumt * (1 + percent / 100) - salary;
            year++;
            if (year >= 100) {
                break;
            }
        }
        return  year;
    }
}
