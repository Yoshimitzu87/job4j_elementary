package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("���� 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "������ �����" : "������ �����";
            System.out.println(player + " ������� ����� �� 1 �� 3:");
            int matches = Integer.parseInt(input.nextLine());

            if (matches <= 3 && matches <= count) {
                count = count - matches;
                System.out.println("�������� ������ �� �����: " + count);
            } else {
                System.out.println("������!");
            }
            turn = !turn;
        }
        if (!turn) {
            System.out.println("������� ������ �����");
        } else {
            System.out.println("������� ������ �����");
        }
    }
}