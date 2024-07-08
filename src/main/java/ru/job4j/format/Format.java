package ru.job4j.format;

import java.util.Calendar;

public class Format {
    public static void getGreetings(String name, int age) {
        System.out.format("Строка1%nСтрока2%n");
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    public static void main(String[] args) {
        getGreetings("Rtrtasd", 22);
        getGreetingAndTime("Elena");

    }
}
