package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double xx = (x2 - x1);
        double yy = (y2 - y1);
        double xPow = Math.pow(xx, 2);
        double yPow = Math.pow(yy, 2);
        double sum = xPow + yPow;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result0 = Point.distance(0, 0, 2, 0);
        System.out.println("result0 (0, 0) to (2, 0) " + result0);

        double result1 = Point.distance(11, 33, 1, 3);
        System.out.println("result1 (11, 1) to (33, 3) " + result1);

        double result2 = Point.distance(15, 2, -1, -3);
        System.out.println("result2 (15, -1) to (2, -3) " + result2);
    }
}