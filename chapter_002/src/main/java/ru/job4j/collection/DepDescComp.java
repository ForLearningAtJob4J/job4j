package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] lstO1 = o1.split("/");
        String[] lstO2 = o2.split("/");

        int res = lstO2[0].compareTo(lstO1[0]);

        return (res == 0) ? (o1.compareTo(o2)) : (res);
    }
}