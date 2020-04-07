package ru.job4j.demos;

public class Animal {
    String name;

    public Animal() {
        System.out.println("animal constructor");
    }

    public Animal(String theName) {
        name = theName;
        System.out.println("animal parametrized constructor");
    }
}
