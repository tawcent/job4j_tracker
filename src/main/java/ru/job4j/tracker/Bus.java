package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус движется к остановке");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Перед конечной остановкой в автобусе " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        int rashod = 10;
        int probeg = 70;
        System.out.println("В начале смены в автобусе был полный бак " + fuel + " литров");
        System.out.println("Расход топлива 10 л на 100 км пути");
        int result = (rashod * probeg) / 100;
        System.out.println("За смену автобус проехал 70 км и потратил " + result + " литров топлива");
        return result;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.passengers(20);
        bus.refuel(100);
    }
}
