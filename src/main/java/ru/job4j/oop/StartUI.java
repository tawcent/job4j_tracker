package ru.job4j.oop;

import ru.job4j.tracker.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime time = item.getCreated();
        DateTimeFormatter formatter = item.getFormatter();
        System.out.println(time.format(formatter));
    }
}
