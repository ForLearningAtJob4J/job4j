package ru.job4j.poly;

public class Bus implements Transport {
    private int capacity;
    private double fuel;

    @Override
    public void drive() {
        System.out.println("...");
    }

    @Override
    public void setCapacity(int num) {
        capacity = num;
    }

    @Override
    public double fill(double volume) {
        fuel += volume;
        return volume * 40;
    }
}
