package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp =  max(first, max(second, third));
        return max(tmp, fourth);
    }

    public static void main(String[] args) {
        int m = Max.max(2, 10);
        System.out.println(m);

        int m1 = Max.max(6, 2);
        System.out.println(m1);

    }
}