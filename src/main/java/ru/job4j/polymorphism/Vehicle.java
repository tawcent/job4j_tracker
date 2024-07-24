package ru.job4j.polymorphism;

public interface Vehicle extends Fuel {

    int WHEELS = 4;

    void accelerate();

    void brake();

    void steer();

    void changeGear();

    void refill();

    static void getDragCofficient() {
        System.out.println("Формула расчета кэффициента аэродинамического сопротивления автомобиля");
    }

    default void chargeBattery() {
        System.out.println("Аккамулятор под капотом. Зарядить");
    }
}
