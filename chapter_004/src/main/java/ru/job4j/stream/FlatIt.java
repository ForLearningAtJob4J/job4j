package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> list = new ArrayList<>();
        it.forEachRemaining(integerIterator -> integerIterator.forEachRemaining(list::add));
        return list;
    }
}
