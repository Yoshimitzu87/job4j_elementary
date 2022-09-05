package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDivide(double first, double second) {
        return diff(first,  second) + divide(first, second);
    }

    public static double sumAndMultiplyAndDivideAndDiff(double first, double second) {
        return sum(first, second) + multiply(first, second) + divide(first, second) + diff(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDivide(20, 40));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDivideAndDiff(100, 50));
    }
}