package ru.job4j.concat;

public class JoinExample {
    public static void main(String[] args) {
        String string = String.join(" ", "abc", "def", "ghi".concat("asdasd"));
        System.out.println(string);
    }
}
