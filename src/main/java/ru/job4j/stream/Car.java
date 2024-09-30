package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    @Override
    public String toString() {
        return "Car{"
                +
                "brand='"
                + brand + '\''
                + ", model='"
                + model + '\''
                + ", created=" + created
                + ", volume=" + volume
                + ", color='" + color + '\''
                + '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Opel")
                .buildModel("Astra")
                .buildCreated(LocalDate.of(2012, 1, 22))
                .buildVolume(1.4)
                .buildColor("Black")
                .build();
        System.out.println(car);
        Car car1 = new Builder()
                .buildBrand("Toyota")
                .buildModel("Corolla")
                .buildCreated(LocalDate.of(2004, 1, 23))
                .buildVolume(1.5)
                .buildColor("Blue")
                .build();
        System.out.println(car1);
    }
}