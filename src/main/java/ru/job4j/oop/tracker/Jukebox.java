package ru.job4j.oop.tracker;

public class Jukebox {

    public void song1() {
        System.out.println("Пусть бегут неуклюже пешеходы по луже");
    }

    public void song2() {
        System.out.println("Спят усталые стажеры, менторы спяяят..");
    }

    public void wrong() {
        System.out.println("Песня не найдена");
    }

    public void music(int position) {
        switch (position) {
            case 1 -> song1();
            case 2 -> song2();
            default -> wrong();
        }
    }

    public static void main(String[] args) {
        Jukebox sing = new Jukebox();
        sing.music(1);
        sing.music(2);
        sing.music(3);
        sing.music(7);
    }
}
