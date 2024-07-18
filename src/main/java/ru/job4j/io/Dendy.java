package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games");
            System.out.println("1. Tanks");
            System.out.println("2. Super Mario");
            System.out.println("3. Exit");
            System.out.print("Select game ");
            int select = Integer.parseInt(input.nextLine());
            run = false;
            if (select == 3) {
                System.out.println("Game over");
            } else if (select == 1) {
                System.out.println("Loading Tanks");
            } else if (select == 2) {
                System.out.println("Loading Super Mario");
            } else {
                System.out.println("Unknown game");
            }
            System.out.println();
        }
    }
}
