package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = addStrings(result, symbol, counter);
                counter = 1;
            }
            symbol = input.charAt(i);
        }

        if (counter > 1) {
            result = addStrings(result, symbol, counter);
        } else if (symbol != input.charAt(input.length() - 2)) {
            result = addStrings(result, symbol, 1);
        }
        return result;
    }

    public static String addStrings(String rsl, char symbol, int counter) {
        if (counter == 1) {
            return rsl + ("" + symbol);
        } else {
            return rsl + ("" + symbol) + counter;
        }
    }
}
