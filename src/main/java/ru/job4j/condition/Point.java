package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(3, 7);
        Point second = new Point(5, 6);
        double result = first.distance(second);
        System.out.println("result (3, 7) to (5, 6) " + result);

        first.x = 8;
        first.y = 67;
        second.x = 5;
        second.y = 12;
        result = first.distance(second);
        System.out.println("result (8, 67) to (5, 12) " + result);

        first = new Point(4, 9);
        second = new Point(-5, 35);
        result = first.distance(second);
        System.out.println("result (4, 9) to (-5, 35) " + result);
    }
}
