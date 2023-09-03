package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int left, int midleft, int midright, int right) {
        return max(left, max(midleft, max(midright, right)));
    }
}
