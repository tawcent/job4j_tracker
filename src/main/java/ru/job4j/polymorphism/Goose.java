package ru.job4j.polymorphism;

public class Goose implements Animal {

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук ГА ГА");
    }
}
