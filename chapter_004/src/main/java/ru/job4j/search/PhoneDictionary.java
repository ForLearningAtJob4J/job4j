package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine =
                ((Predicate<Person>) person -> person.getAddress().equals(key))
                .or(person -> person.getName().equals(key))
                .or(person -> person.getPhone().equals(key))
                .or(person -> person.getSurname().equals(key));

        ArrayList<Person> result = new ArrayList<>();
        persons.forEach(person -> {
            if (combine.test(person)) {
                result.add(person);
            }
        });
        return result;
    }
}