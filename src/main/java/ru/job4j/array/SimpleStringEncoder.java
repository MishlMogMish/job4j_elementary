package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        int last = input.length() - 1;
        for (int i = 1; i < input.length(); i++) {
            if (i == last && symbol == input.charAt(i)) {
                result = addStrings(result, input.charAt(i), counter + 1);

            } else if (i == last && symbol != input.charAt(i)) {
                result = addStrings(addStrings(result, symbol, counter), input.charAt(i), 1);

            } else if (symbol == input.charAt(i)) {
                counter++;

            } else {
                result = addStrings(result, symbol, counter);
                counter = 1;
            }
            symbol = input.charAt(i);
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
