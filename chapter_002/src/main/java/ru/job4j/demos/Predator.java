package ru.job4j.demos;

public class Predator extends Animal {
    public Predator() {
        System.out.println("predator constructor");
    }
    public Predator(String theName) {
        super(theName);
        System.out.println("predator parametrized constructor");
    }
}
