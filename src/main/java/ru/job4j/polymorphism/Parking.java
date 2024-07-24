package ru.job4j.polymorphism;

public interface Parking<T> {
    void park(T car);
}

class CarParking<Car> implements Parking<Car> {
    public void park(Car car) { }
}
