package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count1 = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count1++;
            }
        }
        return count1;
    }
}