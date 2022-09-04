package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double h = (a + b + c) / 2;
        double rsl =  Math.sqrt(h * ((h - a) * (h - b) * (h - c)));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);

        double rsl1 = TrgArea.area(22, 21, 20);
        System.out.println("area (2, 2, 2) = " + rsl1);
    }
}