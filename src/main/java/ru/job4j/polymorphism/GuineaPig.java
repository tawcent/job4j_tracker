package ru.job4j.polymorphism;

public class GuineaPig implements Animal {

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " просто ПИЩИТ");
    }
}
