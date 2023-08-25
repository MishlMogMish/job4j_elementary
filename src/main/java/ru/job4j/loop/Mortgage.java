package ru.job4j.loop;

public class Mortgage {
    public static int year(double amoumt, int salary, double percent) {
        int year = 0;
        while (amoumt > 0) {
            amoumt += amoumt * percent / 100 - salary;
            year++;
        }
        return  year;
    }
}
