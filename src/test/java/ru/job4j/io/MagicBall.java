package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("I'm the great Oracle.What do you want to know?");
        String inp = input.nextLine();
        int answer = new Random().nextInt(3);

        switch (answer) {
            case (0) -> System.out.println("Yes");
            case (1) -> System.out.println("Nope");
            case (2) -> System.out.println("Maybe");
        }

    }
}