package ru.job4j.converter;

public class Converter {
    public  static float rubleToEuro(float value) {
       return value / 70;
    }

    public static  float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");

        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result: " + passed);
        expected = in / 60;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are " + expected + " dollars. Test result: " + passed);
    }
}
