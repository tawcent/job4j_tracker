package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] names = items;
        Item[] copy = new Item[names.length];
        size = 0;
        for (int index = 0; index < names.length; index++) {
            Item name = names[index];
            if (name != null) {
                copy[size] = name;
                size++;
            }
        }
        return copy;
    }

    public Item[] findByName(String key) {
        Item[] names = items;
        Item[] copy = new Item[names.length];
        size = 0;
        for (int index = 0; index < names.length; index++) {
            Item name = names[index];
            if (name != null && name.getName().equals(key)) {
                copy[size] = name;
                size++;
            }
        }
        copy = Arrays.copyOf(copy, size);
        return copy;
    }
}