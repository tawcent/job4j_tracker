package ru.job4j.polymorphism;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " Произносит звук ГАВ ГАВ");
    }
}
