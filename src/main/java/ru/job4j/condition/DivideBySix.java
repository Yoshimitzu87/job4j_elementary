package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "num div by 6.";
        } else if (number % 3 == 0) {
            rsl = "num div by 3, but not even";
        } else if (number % 2 == 0) {
            rsl = "num even, but don't div by 3";
        } else {
            rsl = "num not even and don't div by 3";
        }
        return rsl;
    }
}