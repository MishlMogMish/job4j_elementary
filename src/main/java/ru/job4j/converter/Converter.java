package ru.job4j.converter;

public class Converter {
    public  static float rubleToEuro(float value) {
       float rls = value / 70;
       return rls;
    }

    public static  float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}
