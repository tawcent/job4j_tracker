package ru.job4j.oop.tracker;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name + " eat "  + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("Kotleta");
        gav.show();
        System.out.println("There is black's food");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("Fish");
        black.show();
    }
}
