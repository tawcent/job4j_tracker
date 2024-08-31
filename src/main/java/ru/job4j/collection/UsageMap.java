package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("rusx745@gmail.com", "Dautov R. R");
        map.put("boriscat@gmail.com", "Kotaev B. R");
        map.put("hochypiva@yandex.ru", "Skufof E. R");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
