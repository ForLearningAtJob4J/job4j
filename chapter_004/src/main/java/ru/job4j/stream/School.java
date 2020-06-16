package ru.job4j.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<String, Student> collectToMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getSurname, s -> s, (s, a) -> s));
    }
}
