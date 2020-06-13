package ru.job4j.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        new Object() {
            void twice() {
                for (int i = 0; i < array.length; ++i) {
                    array[i] *= 2;
                }
            }
        }.twice();
        Arrays.asList(array).forEach(System.out::println);
    }
}
