package ru.job4j.record;

import javax.xml.namespace.QName;

public record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return "Person{"
                +
                "name='"
                + name
                + '\''
                +
                ", age="
                + age
                +
                '}';
    }
}