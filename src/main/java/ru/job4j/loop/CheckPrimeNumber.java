package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean chek(int number) {
        boolean prime = number > 1;
        if (prime) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return  prime;
    }
}
