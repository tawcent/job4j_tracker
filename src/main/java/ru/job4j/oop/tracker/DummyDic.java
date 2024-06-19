package ru.job4j.oop.tracker;

public class DummyDic {

    public String engToRus(String eng) {
        String mes = "Неизвестное слово" + eng;
        return mes;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.engToRus(" - Sdasdasdas");
        System.out.println(say);
    }
}
