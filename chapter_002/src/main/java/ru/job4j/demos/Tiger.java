package ru.job4j.demos;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("tiger constructor");
    }
    public Tiger(String theName) {
        super(theName);
        System.out.println("tiger parametrized constructor");
    }
}
