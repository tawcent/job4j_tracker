package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите количество спичек от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > Math.min(3, count)) {
                System.out.println("Ошибка! Введите число от 1 до 3!");
            } else {
                count -= matches;
                System.out.println("На столе осталось спичек: " + count);
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Победа первого игрока!");
        } else {
            System.out.println("Победа второго игрока!");
        }
    }
}


