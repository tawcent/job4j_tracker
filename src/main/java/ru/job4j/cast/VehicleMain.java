package ru.job4j.cast;

import ru.job4j.polymorphism.Animal;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle airbus = new Airbus();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[] {airbus, bus, train};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
