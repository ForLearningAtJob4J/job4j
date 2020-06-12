package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionOutputArray {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> res = new ArrayList<>(end - start);
        for (double i = start; i < end; i++) {
            res.add(func.apply(i));
        }
        return res;
    }
}