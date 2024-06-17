package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    public String surname;
    private final int sizeOfempty = 10;

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b) {
    }

    String name;

    Broken() {
    }
}