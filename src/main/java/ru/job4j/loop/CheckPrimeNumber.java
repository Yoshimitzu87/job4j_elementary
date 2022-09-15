package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number - 1; i++) {
            if ((number  % 5) == 0) {
                prime = true;
                break;
            } else {
                prime = false;
            }
        }
        return prime;
    }
}