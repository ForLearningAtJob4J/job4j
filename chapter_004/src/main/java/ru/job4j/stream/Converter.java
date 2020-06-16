package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Converter {
    static List<Integer> convertIntegerMatrixToIntegerList(Integer[][] matrix) {
        return List.of(matrix).stream().flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
