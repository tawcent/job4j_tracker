package ru.job4j.oop.tracker;

public class Student {

    public void sing() {
        System.out.println("I believe i can fly");
    }

    public void music(String lyrics) {
        System.out.println("I can sing song : " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe i can fly";
        petya.music(song);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
