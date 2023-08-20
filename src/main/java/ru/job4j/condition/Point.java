package ru.job4j.condition;

public class Point {
    public static  double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public  static  void  main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = distance(10, 20, 4, 8);
        System.out.println("result (10, 20) to (4, 8) " + result);
        result = distance(-5, 5, 3, -11);
        System.out.println("result (-5, 5) to (3, -11) " + result);
    }
}
