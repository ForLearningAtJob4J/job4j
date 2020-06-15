package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerMatrix {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}};
        System.out.println(List.of(matrix).stream().flatMap(Arrays::stream).collect(Collectors.toList()));
    }
}
