package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int m = Max.max(2, 10);
        System.out.println(m);

        int m1 = Max.max(6, 2);
        System.out.println(m1);

    }
}