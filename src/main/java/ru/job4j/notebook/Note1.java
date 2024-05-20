package ru.job4j.notebook;

public class Note1 {
    public static void main(String[] args) {
        boolean bool = false;
        System.out.println("div by  " + !bool);
        int value = 0;
        Note1.calc(0);
        int count = 0;
        while (count < 5) {
            count++;
        }
        System.out.println(count);
    }

    public static void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }
}

