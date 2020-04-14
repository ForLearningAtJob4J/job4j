package ru.job4j.poly;

public interface Transport {
    void drive();
    void setCapacity(int num);
    double fill(double volume);
}
