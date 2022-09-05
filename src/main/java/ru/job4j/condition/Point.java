package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result0 = Point.distance(1, 2, 1, 2);
        System.out.println("result0 (0, 0) to (2, 0) " + result0);

        double result1 = Point.distance(5, 6, 6, 7);
        System.out.println("result1 (11, 1) to (33, 3) " + result1);

        double result2 = Point.distance(2, 1, 8, 9);
        System.out.println("result2 (15, -1) to (2, -3) " + result2);
    }
}